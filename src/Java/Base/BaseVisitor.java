package Java.Base;

import Java.AST.FunctionDeclaration;
import Java.AST.ParametesandArgs.args;
import Java.AST.Parse;
import Java.AST.QueryStmt.*;
import Java.AST.QueryStmt.Alter_Stmt.*;
import Java.AST.QueryStmt.Create_Stmt.*;
import Java.AST.QueryStmt.Delete.DeleteStmt;
import Java.AST.QueryStmt.Drop.DropStmt;
import Java.AST.QueryStmt.InsertStmt.InsertStmt;
import Java.AST.QueryStmt.Join.Join_Clause;
import Java.AST.QueryStmt.Join.Join_Constrain;
import Java.AST.QueryStmt.Join.Join_Opreator;
import Java.AST.QueryStmt.SelectStmt.*;
import Java.AST.QueryStmt.UpdateStmt.Asign_Expr_to_column;
import Java.AST.QueryStmt.UpdateStmt.UpdateStmt;
import Java.AST.Table_Constraint.ForeignKeyClause;
import Java.AST.Table_Constraint.IndexedColumn;
import Java.AST.Table_Constraint.TableConstraintPrimaryKey;
import Java.AST.expr.*;
import Java.AST.commn_classes_Sql.name_rule.*;
import Java.AST.instruction.Print_rule.Inside_the_print;
import Java.AST.instruction.Print_rule.Print;
import Java.AST.instruction.Returning.returnes_rule;
import generated.SQLBaseVisitor;
import generated.SQLParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Java.AST.assignmnet.Variable_with_opretor;
import Java.AST.create.createvariableform;
import Java.AST.create.creating_var_without_assign;
import Java.AST.create.generalcreating;
import Java.AST.creating.createwihtoutassign;
import Java.AST.creating.creatingvariabelwithoutassing;
import Java.AST.creating.gneralcreating;
import Java.AST.function.function_body;
import Java.AST.function.function_header;
import Java.AST.instruction.Switch_rule.Case;
import Java.AST.instruction.Switch_rule.Deafult;
import Java.AST.instruction.Switch_rule.Switch;
import Java.AST.instruction.loops.*;
import generated.SQLBaseVisitor;
import generated.SQLParser;
import Java.AST.instruction.*;
import Java.AST.instruction.IF_rule.*;
import Java.AST.expr.*;
import Java.AST.arrayandjson.*;
import Java.AST.creating.*;
import Java.AST.ParametesandArgs.*;
import Java.AST.tokens.*;
import org.antlr.v4.runtime.*;
import Java.AST.assignmnet.*;
import Java.AST.instruction.Returning.*;
import org.antlr.v4.runtime.tree.TerminalNode;


import javax.lang.model.type.NullType;
import java.util.*;

public class BaseVisitor extends SQLBaseVisitor {

    @Override
    public Parse visitParse(SQLParser.ParseContext ctx) {
        System.out.println("visitParse");
        Parse p = new Parse();
        if(!ctx.sql_stmt_list().isEmpty()) {
            for (int i = 0; i <ctx.sql_stmt_list().size() ; i++) {
                for (int j = 0; j <ctx.sql_stmt_list().get(i).sql_stmt().size() ; j++) {
                    p.getSqlStmts().add(visitSql_stmt(ctx.sql_stmt_list().get(i).sql_stmt().get(j)));
                }
            }
        }
        else if (ctx.funtion() != null)
        {
            for (int i = 0; i <ctx.funtion().size() ; i++) {
                    p.getFunctions().add(visitFuntion(ctx.funtion(i)));
            }
        }
        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number


        return p;
    }

    @Override
    public Object visitError(SQLParser.ErrorContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        System.out.println("visitSql_stmt_list");

        List<Statement> sqlStmt = new ArrayList<Statement>();
        for (int i = 0; i < ctx.sql_stmt().size(); i++) {
            sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));

        }

        return sqlStmt;

    }

    @Override
    public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {

        System.out.println("visitSql_stmt   ");
        Statement s = new Statement();
        if(ctx.factored_select_stmt() != null){
            s = visitFactored_select_stmt(ctx.factored_select_stmt());
        }
        if (ctx.delete_stmt() != null) {
            s = visitDelete_stmt(ctx.delete_stmt());
        } else if (ctx.drop_table_stmt() != null) {
            s = visitDrop_table_stmt(ctx.drop_table_stmt());//todo check for more detail
        } else if (ctx.create_table_stmt() != null) {
            s = visitCreate_table_stmt(ctx.create_table_stmt());
        } else if (ctx.alter_table_stmt() != null) {
            s = visitAlter_table_stmt(ctx.alter_table_stmt());
        } else if (ctx.insert_stmt() != null) {
            s = visitInsert_stmt(ctx.insert_stmt());
        } else if (ctx.update_stmt() != null) {
            s = visitUpdate_stmt(ctx.update_stmt());
        }

        return s;

    }

    @Override
    public SelectFactoredStmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx) {
        System.out.println("visitFactored_select_stmt");
        SelectFactoredStmt select = new SelectFactoredStmt();
        if(ctx.select_core()!=null){
            select.setSelect_core(visitSelect_core(ctx.select_core()));
            if(ctx.ordering_term()!=null){
                List<Ordering_term> ordering_terms = new ArrayList<>();
                for (int i = 0; i <ctx.ordering_term().size() ; i++) {
                    ordering_terms.add(visitOrdering_term(ctx.ordering_term(i)));
                }
                select.setOrdering_terms(ordering_terms);
            }
            if(ctx.limit_expr()!=null){
                select.setLimitExpr(visitExpr(ctx.limit_expr().expr()));
                if(ctx.K_OFFSET()!=null){
                    select.setOffset(true);
                }
                else if(ctx.expr()!=null){
                    select.setExpr(visitExpr(ctx.expr()));
                }
            }

        }

        select.setName("Select");
        return select;
    }

    @Override
    public DeleteStmt visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
        System.out.println("visitDelete_Stmt");
        DeleteStmt delete = new DeleteStmt();
        if(ctx.qualified_table_name()!=null) {
            delete.setQualifiedTableName(visitQualified_table_name(ctx.qualified_table_name()));
            if(ctx.where_expr()!=null){
                delete.setExpr(visitExpr(ctx.where_expr().expr()));
            }
            delete.setName("Delete");
            return delete;
        }
        else
            return null;
    }


    @Override
    public DropStmt visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx) {
        System.out.println("visitDrop_table_stmt");
        DropStmt drop = new DropStmt();
        if(ctx.K_IF()!=null&&ctx.K_EXISTS()!=null){
            drop.setExist(true);
        }
        if(ctx.database_name()!=null){
            drop.setDataBaseName(visitDatabase_name(ctx.database_name()));
        }
        if(ctx.table_name()!=null){
            drop.setTableName(visitTable_name(ctx.table_name()));
            drop.setName("Drop");
        }
        else
            return null;


        return drop;
    }

    @Override
    public CreateTableStmt visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        System.out.println("visitCreate_table_stmt");
        CreateTableStmt createTableStmt = new CreateTableStmt();
        if(ctx.database_name()!=null) {
            createTableStmt.setDataBaseName(visitDatabase_name(ctx.database_name()));
        }
        if(ctx.table_name()!=null){
            createTableStmt.setTableName(visitTable_name(ctx.table_name()));
            if(ctx.column_def()!=null){
                List<ColumnDef> columnDefs = new ArrayList<>();
                for (int i = 0; i <ctx.column_def().size() ; i++) {
                    columnDefs.add(visitColumn_def(ctx.column_def(i)));
                }
                createTableStmt.setColumnDefs(columnDefs);
                if(ctx.table_constraint()!=null){
                    List<TableConstraint> tableConstraints= new ArrayList<>();
                    for (int i = 0; i <ctx.table_constraint().size() ; i++) {
                        tableConstraints.add(visitTable_constraint(ctx.table_constraint(i)));
                    }
                    createTableStmt.setTableConstraints(tableConstraints);
                }
                if(ctx.select_stmt()!=null){
                    createTableStmt.setSelect_stmt(visitSelect_stmt(ctx.select_stmt()));
                }
            }

        }
        createTableStmt.setName("Create Table");




        return createTableStmt;
    }


    @Override
    public ColumnDef visitColumn_def(SQLParser.Column_defContext ctx) {
        System.out.println("visitColumn_def");
        ColumnDef colmndef = new ColumnDef();
        if (ctx.column_name() != null) {
            colmndef.setName(ctx.column_name().use_random_name().RANDOM_NAME().getText());
            if (ctx.column_constraint() != null) {
                for (int i = 0; i < ctx.column_constraint().size(); i++) {
                    colmndef.addItemToListOfColumnConstraint(visitColumn_constraint(ctx.column_constraint(i)));
                }
            }
            if (ctx.type_name() != null) {
                for (int i = 0; i < ctx.type_name().size(); i++) {
                    colmndef.addItemToListOfTypeName(visitType_name(ctx.type_name(i)));
                }
            }
        }
        return colmndef;
    }


    @Override
    public ColumnConstraint visitColumn_constraint(SQLParser.Column_constraintContext ctx) {
        System.out.println("visitCoumn_constraint");
        ColumnConstraint columnConstraint = new ColumnConstraint();
        if (ctx.name() != null) {
            columnConstraint.setConstraintname(ctx.name().use_random_name().RANDOM_NAME().getText());
            System.out.println("the nam constraint is : " + columnConstraint.getConstraintname());
        }

        if (ctx.column_constraint_primary_key() != null) {
            columnConstraint.setConstrainttype(ctx.column_constraint_primary_key().getText());
            System.out.println("the constraint is  : " + columnConstraint.getConstrainttype());
        } else if (ctx.column_constraint_foreign_key() != null) {
            columnConstraint.setConstrainttype((ctx.column_constraint_foreign_key().getText()));
            System.out.println("the constraint is  : " + columnConstraint.getConstrainttype());
        } else if (ctx.collation_name() != null) {
            columnConstraint.setConstrainttype(ctx.collation_name().getText());
            System.out.println("the constraint is  : collation " + columnConstraint.getConstrainttype());
        } else if (ctx.column_constraint_null() != null) {
            columnConstraint.setConstrainttype(ctx.column_constraint_null().getText());
            System.out.println("the constraint is  : " + columnConstraint.getConstrainttype());
        } else if (ctx.column_constraint_not_null() != null) {
            columnConstraint.setConstrainttype(ctx.column_constraint_not_null().getText());
            System.out.println("the constraint is  : " + columnConstraint.getConstrainttype());
        } else if (ctx.column_default() != null) {
            columnConstraint.setConstrainttype(ctx.column_default().getText());
            System.out.println("the constraint is  : " + columnConstraint.getConstrainttype());
        } else if (ctx.column_unique() != null) {
            columnConstraint.setConstrainttype(ctx.column_unique().getText());
            System.out.println("the constraint is  : " + columnConstraint.getConstrainttype());
        } else if (ctx.column_check() != null) {
            columnConstraint.setConstrainttype(ctx.column_check().getText());
            System.out.println("the constraint is  : " + columnConstraint.getConstrainttype());
        }


        return columnConstraint;
    }


    @Override
    public TableConstraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        System.out.println("visitTable_constraint");
        TableConstraint tableConstraint = new TableConstraint();
        if (ctx.name() != null) {
            tableConstraint.setCostraintname(ctx.name().use_random_name().RANDOM_NAME().getText());
            System.out.println("the nam constraint is : " + tableConstraint.getCostraintname());
        }
        if (ctx.table_constraint_primary_key() != null) {
            tableConstraint.setConstrainttype(ctx.table_constraint_primary_key().getText());
            System.out.println("the constraint is  : " + tableConstraint.getConstrainttype());
        } else if (ctx.table_constraint_foreign_key() != null) {
            tableConstraint.setConstrainttype((ctx.table_constraint_foreign_key().getText()));
            System.out.println("the constraint is  : " + tableConstraint.getConstrainttype());
        } else if (ctx.table_constraint_unique() != null) {
            tableConstraint.setConstrainttype(ctx.table_constraint_unique().getText());
            System.out.println("the constraint is  : " + tableConstraint.getConstrainttype());
        } else if (ctx.table_constraint_key() != null) {
            tableConstraint.setConstrainttype(ctx.table_constraint_key().getText());
            System.out.println("the constraint is  : " + tableConstraint.getConstrainttype());
        } else if (ctx.table_check() != null) {
            tableConstraint.setConstrainttype(ctx.table_check().getText());
            System.out.println("the constraint is  : " + tableConstraint.getConstrainttype());
        }
        return tableConstraint;
    }


    @Override
    public TypeName visitType_name(SQLParser.Type_nameContext ctx) {
        System.out.println("visitType_name");
        TypeName typeName = new TypeName();
        if (ctx.name() != null) {
            if (ctx.signed_number1() != null) {
                typeName.setLim1(ctx.signed_number1().signed_number().NUMERIC_LITERAL().getText());
                System.out.println("singed_number is : " + typeName.getLim1());
            } else if (ctx.signed_number2() != null) {
                typeName.setLim2(ctx.signed_number2().getText());
                System.out.println("singed_number is : " + "(" + typeName.getLim2() + ")");
            }

        }
        return typeName;
    }


    @Override
    public AlterTableStmt visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) {
        System.out.println("visitAlter_table_stmt");
        AlterTableStmt alterTableStmt = new AlterTableStmt();
        if (ctx.source_table_name() != null) {
            if (ctx.database_name() != null) {
                alterTableStmt.setTablename(ctx.database_name().use_random_name().RANDOM_NAME().getText() + "." +
                        ctx.source_table_name().use_random_name().RANDOM_NAME().getText());
            } else {
                alterTableStmt.setTablename(ctx.source_table_name().use_random_name().RANDOM_NAME().getText());
            }

            if (ctx.renametable() != null) {
                alterTableStmt.setAltertype(visitRenametable(ctx.renametable()));
            } else if (ctx.alter_table_add() != null) {
                alterTableStmt.setAltertype(visitAlter_table_add(ctx.alter_table_add()));

            } else if (ctx.alter_table_add_constraint() != null) {
                alterTableStmt.setAltertype(visitAlter_table_add_constraint(ctx.alter_table_add_constraint()));
            } else if (ctx.addcolumn() != null) {
                alterTableStmt.setAltertype(visitAddcolumn(ctx.addcolumn()));
            }
        }
        alterTableStmt.setName("Alter table");
        return alterTableStmt;
    }


    @Override
    public RenameTable visitRenametable(SQLParser.RenametableContext ctx) {
        System.out.println("visitRenametable");
        RenameTable renameTable = new RenameTable();
        if (ctx.new_table_name() != null) {
            renameTable.setNewname(ctx.new_table_name().use_random_name().RANDOM_NAME().getText());
            System.out.println("the new Name after rename is : " + renameTable.getNewname());
        }
        return renameTable;

    }


    @Override
    public AlterTableAdd visitAlter_table_add(SQLParser.Alter_table_addContext ctx) {
        System.out.println("visitAlter_table_add");
        AlterTableAdd alterTableAdd = new AlterTableAdd();
        if (ctx.table_constraint() != null) {
            alterTableAdd.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
        }
        return alterTableAdd;
    }


    @Override
    public AlterTableAddConstraint visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx) {
        System.out.println("visitAlter_table_add_constraint");
        AlterTableAddConstraint alterTableAddConstraint = new AlterTableAddConstraint();
        if (ctx.use_random_name() != null) {
            alterTableAddConstraint.setTablename(ctx.use_random_name().RANDOM_NAME().getText());
            System.out.println("the table Name that want to alter is : " + alterTableAddConstraint.getTablename());
            if (ctx.table_constraint() != null) {
                alterTableAddConstraint.setTableConstraint(visitTable_constraint(ctx.table_constraint()));
            }
        }
        return alterTableAddConstraint;
    }


    @Override
    public InsertStmt visitInsert_stmt(SQLParser.Insert_stmtContext ctx) {
        System.out.println("visitInsert_stmt");
        InsertStmt insertStmt = new InsertStmt();

        if (ctx.database_name() != null) {
            insertStmt.setDataBaseName(visitDatabase_name(ctx.database_name()));
        }

        if (ctx.table_name() != null) {
            insertStmt.setTableName(visitTable_name(ctx.table_name()));
            if (ctx.column_name() != null) {
                for (int i = 0; i < ctx.column_name().size(); i++) {
                    insertStmt.addItemToListOfColumnName(visitColumn_name(ctx.column_name(i)));
                }
            }

            if (ctx.expr() != null) {
                for (int i = 0; i < ctx.expr().size(); i++) {
                    insertStmt.addItemToListOfExpr(visitExpr(ctx.expr(i)));
                }
            }

            if (ctx.select_stmt() != null) {
                System.out.println("select statment ");
                insertStmt.setSleSelect_stmt(visitSelect_stmt(ctx.select_stmt()));
            }

            if (ctx.K_DEFAULT() != null && ctx.K_VALUES() != null) {
                System.out.println("set default values ");
                insertStmt.setDefalut_value(true);
            }

        }

        return insertStmt;
    }


    @Override
    public UpdateStmt visitUpdate_stmt(SQLParser.Update_stmtContext ctx) {
        System.out.println("visitUpdate_stmt");
        UpdateStmt updateStmt = new UpdateStmt();
        if (ctx.qualified_table_name() != null) {
            updateStmt.setQualifiedTableName(visitQualified_table_name(ctx.qualified_table_name()));
        }

        if (ctx.asign_expr_to_column() != null) {
            for (int i = 0; i < ctx.asign_expr_to_column().size(); i++) {
                updateStmt.addItemToListOfAsign_expr_to_column(visitAsign_expr_to_column(ctx.asign_expr_to_column(i)));
            }
        }

        if (ctx.K_WHERE() != null && ctx.expr() != null) {
            {
                updateStmt.setWhereExpr(visitExpr(ctx.expr()));
            }
        }

        updateStmt.setName("Update");

        return updateStmt;
    }


    @Override
    public Asign_Expr_to_column visitAsign_expr_to_column(SQLParser.Asign_expr_to_columnContext ctx) {
        System.out.println("visitAsign_expr_to_column");
        Asign_Expr_to_column asign_expr_to_column = new Asign_Expr_to_column();
        if (ctx.column_name() != null && ctx.expr() != null) {
            asign_expr_to_column.setColumnName(visitColumn_name(ctx.column_name()));
            asign_expr_to_column.setExpr(visitExpr(ctx.expr()));
        }
        return asign_expr_to_column;
    }

// ---------------------------------------------select statment ----------------------------------------------------

    @Override
    public select_stmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");
        select_stmt select_stmt = new select_stmt();
        if (ctx.select_or_values() != null) {
            select_stmt.setSelectOrValue(visitSelect_or_values(ctx.select_or_values()));
            if (ctx.ordering_term() != null) {
                for (int i = 0; i < ctx.ordering_term().size(); i++) {
                    select_stmt.addItemToListof_ordering_term(visitOrdering_term(ctx.ordering_term(i)));
                }
            }
            if(ctx.limit_expr()!=null){
                select_stmt.setLimitExpr(visitExpr(ctx.limit_expr().expr()));
                if(ctx.K_OFFSET()!=null){
                    select_stmt.setOffset(true);
                }
                else if(ctx.expr()!=null){
                    select_stmt.setExpr(visitExpr(ctx.expr()));
                }
            }
            select_stmt.setName("select_stmt");
            return select_stmt;
        } else
            return null;
    }

    @Override
    public Select_Core visitSelect_core(SQLParser.Select_coreContext ctx) {
        System.out.println("visitSelect_core");
        Select_Core select_core = new Select_Core();
        if (ctx.result_column() != null) {
            List<Reslult_Cloumn> reslult_cloumnList = new ArrayList<>();
            for (int i = 0; i < ctx.result_column().size(); i++) {
                reslult_cloumnList.add(visitResult_column(ctx.result_column(i)));
            }
            select_core.setReslult_cloumnList(reslult_cloumnList);

            if (ctx.table_or_subquery() != null) {
                List<TableOrSubQuery> tableOrSubQueryList = new ArrayList<>();
                for (int i = 0; i < ctx.table_or_subquery().size(); i++) {
                    tableOrSubQueryList.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
                }
                select_core.setTableOrSubQueryList(tableOrSubQueryList);
                if(ctx.where_expr()!=null){
                    select_core.setWhereExpr(visitExpr(ctx.where_expr().expr()));
                }
                if(ctx.expr()!=null){
                    List<Expr> exprs = new ArrayList<>();
                    for (int i = 0; i <ctx.expr().size() ; i++) {
                        exprs.add(visitExpr(ctx.expr(i)));
                    }
                    select_core.setExprList_Group(exprs);
                    if(ctx.having_expr()!=null){
                        System.out.println("set having value ");
                        select_core.setHavingExpr(visitExpr(ctx.having_expr().expr()));
                    }
                }

            }
            if (ctx.join_clause() != null) {
                select_core.setJoin_clause(visitJoin_clause(ctx.join_clause()));
                if(ctx.where_expr()!=null){
                    select_core.setWhereExpr(visitExpr(ctx.where_expr().expr()));
                }
                if(ctx.expr()!=null){
                    List<Expr> exprs = new ArrayList<>();
                    for (int i = 0; i <ctx.expr().size() ; i++) {
                        exprs.add(visitExpr(ctx.expr(i)));
                    }
                    select_core.setExprList_Group(exprs);
                }
            }
        }
        else if(ctx.list_of_expr()!=null){
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i < ctx.list_of_expr().expr().size() ; i++) {
                exprs.add(visitExpr(ctx.list_of_expr().expr(i)));
            }
            select_core.setExprList_Values(exprs);
            if(ctx.list_of_list_of_expr()!=null){
                List<List_Of_Expr> list_of_exprs = new ArrayList<>();
                for (int i = 0; i <ctx.list_of_list_of_expr().list_of_expr().size() ; i++) {
                    list_of_exprs.add(visitList_of_expr(ctx.list_of_list_of_expr().list_of_expr(i)));
                }
                select_core.setList_of_exprList(list_of_exprs);
            }
        }

        return select_core;
    }

    @Override public List_Of_Expr visitList_of_expr(SQLParser.List_of_exprContext ctx) {
        List_Of_Expr list_of_expr = new List_Of_Expr();
        if(ctx.expr()!=null){
            List<Expr> exprs = new ArrayList<>();
            for (int i = 0; i <ctx.expr().size() ; i++) {
                exprs.add(visitExpr(ctx.expr(i)));
            }
            list_of_expr.setExprList(exprs);
        }
        return list_of_expr; }

    @Override public SelectOrValue visitSelect_or_values(SQLParser.Select_or_valuesContext ctx)
    {int c=1;
        System.out.println("visitSelect_or_values");
        SelectOrValue selectOrValue= new SelectOrValue();
        if(ctx.result_column()!=null){
            for (int i = 0; i < ctx.result_column().size(); i++) {
                selectOrValue.addItemToListOf_reslult_coulmn(visitResult_column(ctx.result_column(i)));
            }
            if(ctx.table_or_subquery()!=null){
                for (int i = 0; i <ctx.table_or_subquery().size() ; i++) {
                    selectOrValue.addItemToListOftableOrSubQuery(visitTable_or_subquery(ctx.table_or_subquery(i)));
                }
                if(ctx.join_clause()!=null){
                    selectOrValue.setJoin_clause(visitJoin_clause(ctx.join_clause()));
                }
                if(ctx.where_expr()!=null){
                    selectOrValue.setWhere_expr(visitExpr(ctx.where_expr().expr()));
                }
                if(ctx.K_GROUP()!=null && ctx.expr()!=null){
                    c = ctx.expr().size();
                    for (int i = 0 ; i <c; i++) {
                        selectOrValue.addItemToListOfExpr(visitExpr(ctx.expr(i)));
                    }
                    if(ctx.having_expr()!=null){
                        System.out.println("the having value is ");
                        selectOrValue.setHaving_expr(visitExpr(ctx.having_expr().expr()));

                    }

                }
                else if(ctx.K_VALUES()!=null&& ctx.expr()!=null){
                    for (int i = 0; i <ctx.expr().size() ; i++) {
                        selectOrValue.addItemToListOfExpr(visitExpr(ctx.expr(i)));
                    }
                }
            }

        }

        return selectOrValue;
    }


    @Override public Join_Clause visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        System.out.println("visitJoin_clause");
        Join_Clause join_clause = new Join_Clause();
        if(ctx.table_or_subquery()!=null){
            join_clause.setTableOrSubQuery(visitTable_or_subquery(ctx.table_or_subquery(0)));
            if(ctx.join_operator()!=null&&ctx.table_or_subquery().size()>1&& ctx.join_constraint()!=null){

                List<TableOrSubQuery> tableOrSubQueryList = new ArrayList<>();
                for (int i = 1; i <ctx.table_or_subquery().size() ; i++) {
                    tableOrSubQueryList.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
                }
                join_clause.setTableOrSubQueryList(tableOrSubQueryList);

                List<Join_Constrain> join_constrains = new ArrayList<>();

                List<Join_Opreator> join_opreators = new ArrayList<>();
                for (int i = 0; i <ctx.join_operator().size() ; i++) {
                    join_opreators.add(visitJoin_operator(ctx.join_operator(i)));
                    join_constrains.add(visitJoin_constraint(ctx.join_constraint(i)));
                }
                join_clause.setJoin_opreatorList(join_opreators);

            }


        }
        return join_clause; }


    @Override public Join_Constrain visitJoin_constraint(SQLParser.Join_constraintContext ctx) {
        Join_Constrain join_constrain = new Join_Constrain();
        System.out.println("visitJoin_constraint");
        if(ctx.expr()!=null){
            join_constrain.setExpr(visitExpr(ctx.expr()));
        }
        return join_constrain;
    }

    @Override public Join_Opreator visitJoin_operator(SQLParser.Join_operatorContext ctx) {
        Join_Opreator join_opreator = new Join_Opreator();
        System.out.println("visitJoin_operator");
        return  join_opreator ;
    }

    @Override public TableOrSubQuery visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {
        System.out.println("visitTable_or_subquery");
        TableOrSubQuery tableOrSubQuery = new TableOrSubQuery();
        if(ctx.table_name()!=null){
            if(ctx.database_name()!=null){
                tableOrSubQuery.setDataBaseName(visitDatabase_name(ctx.database_name()));
            }
            tableOrSubQuery.setTableName(visitTable_name(ctx.table_name()));
            if(ctx.table_alias()!=null){
                tableOrSubQuery.setTable_alias(visitTable_alias(ctx.table_alias()));
            }
            if(ctx.index_name()!=null){
                tableOrSubQuery.setIndexName(visitIndex_name(ctx.index_name()));
            }
        }
        else if(ctx.table_or_subquery()!=null ){
            List<TableOrSubQuery> tableOrSubQueryList = new ArrayList<>();
            for (int i = 0; i <ctx.table_or_subquery().size() ; i++) {
                tableOrSubQueryList.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
            }
            tableOrSubQuery.setLisTableOrSubQueries(tableOrSubQueryList);
            if(ctx.table_alias()!=null){
                tableOrSubQuery.setTable_alias(visitTable_alias(ctx.table_alias()));
            }
        }
        else if(ctx.join_clause()!=null){
            tableOrSubQuery.setJoin_clause(visitJoin_clause(ctx.join_clause()));
            if(ctx.table_alias()!=null){
                tableOrSubQuery.setTable_alias(visitTable_alias(ctx.table_alias()));
            }
        }
        else if (ctx .select_stmt()!=null){
            tableOrSubQuery.setSelect_stmt(visitSelect_stmt(ctx.select_stmt()));
            if(ctx.table_alias()!=null){
                tableOrSubQuery.setTable_alias(visitTable_alias(ctx.table_alias()));
            }
        }

        return tableOrSubQuery;
    }

    @Override public Reslult_Cloumn visitResult_column(SQLParser.Result_columnContext ctx)
    {
        System.out.println("visitResult_column");
        Reslult_Cloumn reslult_cloumn = new Reslult_Cloumn();
        if (ctx.STAR()!=null){
            reslult_cloumn.setStar(true);
        }
        else if(ctx.table_name()!=null && ctx.DOT()!=null && ctx.STAR()!=null){
            reslult_cloumn.setTableName(visitTable_name(ctx.table_name()));
            reslult_cloumn.setStar(true);
        }
        else if(ctx.expr()!=null){
            reslult_cloumn.setExpr(visitExpr(ctx.expr()));
            if(ctx.K_AS()!=null &&ctx.column_alias()!=null){
                reslult_cloumn.setColumn_alias(visitColumn_alias(ctx.column_alias()));
            }
        }
        return reslult_cloumn ;
    }

    @Override public Ordering_term visitOrdering_term(SQLParser.Ordering_termContext ctx) {
        System.out.println("visitOrdering_term");
        Ordering_term ordering_term = new Ordering_term();
        if (ctx.expr()!=null){
            ordering_term.setExpr(visitExpr(ctx.expr()));
        }
        return ordering_term; }

    //------------------------------------------------------table constraint ------------------------------------------
    @Override public AddColumn visitAddcolumn(SQLParser.AddcolumnContext ctx)
    {
        System.out.println("visitAddcolumn");
        AddColumn addColumn = new AddColumn();
        if(ctx.column_def()!=null){
            addColumn.setColumnDef(visitColumn_def(ctx.column_def()));
        }
        return addColumn ;
    }


    @Override public TableConstraintPrimaryKey visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx)
    {
        System.out.println("visitTable_constraint_primary_key");
        TableConstraintPrimaryKey tableConstraintPrimaryKey= new TableConstraintPrimaryKey();
        if(ctx.indexed_column()!=null){
            for (int i = 0; i <ctx.indexed_column().size() ; i++) {
                tableConstraintPrimaryKey.addItemToListOfIndexedColumn(visitIndexed_column(ctx.indexed_column(i)));
            }
        }
        return tableConstraintPrimaryKey;
    }


    @Override public IndexedColumn visitIndexed_column(SQLParser.Indexed_columnContext ctx)
    {
        System.out.println("visitIndexed_column");
        IndexedColumn indexedColumn= new IndexedColumn();
        if(ctx.column_name()!=null){
            indexedColumn.setColumnname(ctx.collation_name().use_random_name().RANDOM_NAME().getText());
            System.out.println("the column_indexed is : "+indexedColumn.getColumnname());
            if(ctx.collation_name()!=null){
                indexedColumn.setColectionname(ctx.collation_name().use_random_name().RANDOM_NAME().getText());
                System.out.println("the collaction Name is :"+indexedColumn.getColectionname());
            }
            if(ctx.K_ASC()!=null){
                indexedColumn.setASK(true);
            }
            else if(ctx.K_DESC()!=null){
                indexedColumn.setDESK(true);
            }
        }
        return indexedColumn;
    }

    @Override public ForeignKeyClause visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx)
    {
        System.out.println("visitForeign_key_clause");
        ForeignKeyClause foreignKeyClause = new ForeignKeyClause();
        if(ctx.database_name()!=null) {
            foreignKeyClause.setDataBaseName(visitDatabase_name(ctx.database_name()));
        }
        if(ctx.foreign_table()!=null){
            foreignKeyClause.setForeignTable(visitForeign_table(ctx.foreign_table()));
            if(ctx.fk_target_column_name()!=null){
                for (int i = 0; i <ctx.fk_target_column_name().size() ; i++) {
                    foreignKeyClause.addItemToListOfFkTarget_ColumnName(visitFk_target_column_name(ctx.fk_target_column_name(i)));
                }
            }
            if(ctx.K_UPDATE()!=null){
                foreignKeyClause.setUpdate(true);
                if(ctx.K_SET()!=null&&ctx.K_NULL()!=null){
                    foreignKeyClause.setSetnull(true);
                }
                else if(ctx.K_SET()!=null&&ctx.K_DELETE()!=null){
                    foreignKeyClause.setSetdefault(true);
                }
                else if(ctx.K_CASCADE()!=null){
                    foreignKeyClause.setCascade(true);
                }
                else if (ctx.K_MATCH()!=null){
                    foreignKeyClause.setMatch(true);
                    foreignKeyClause.setNameMatch(visitName(ctx.name(0)));
                }
                else if (ctx.K_RESTRICT()!=null){
                    foreignKeyClause.setRestrict(true);
                }
                else if (ctx.K_NO()!=null&&ctx.K_ACTION()!=null){
                    foreignKeyClause.setNoaction(true);
                }
            }
        }
        else if(ctx.K_DELETE()!=null){
            foreignKeyClause.setDelete(true);
            if(ctx.K_SET()!=null&&ctx.K_NULL()!=null){
                foreignKeyClause.setSetnull(true);
            }
            else if(ctx.K_SET()!=null&&ctx.K_DELETE()!=null){
                foreignKeyClause.setSetdefault(true);
            }
            else if(ctx.K_CASCADE()!=null){
                foreignKeyClause.setCascade(true);
            }
            else if (ctx.K_MATCH()!=null){
                foreignKeyClause.setMatch(true);
                foreignKeyClause.setNameMatch(visitName(ctx.name(0)));
            }
            else if (ctx.K_RESTRICT()!=null){
                foreignKeyClause.setRestrict(true);
            }
            else if (ctx.K_NO()!=null&&ctx.K_ACTION()!=null){
                foreignKeyClause.setNoaction(true);
            }
        }


        return null;
    }

    public void DFS(Expr e){
        Stack<Expr> exprStack= new Stack<>();
        exprStack.push(e);

    }


    //    -----------------------------------------------------expr----------------------------------------------------
    @Override public Expr visitExpr(SQLParser.ExprContext ctx) {
        System.out.println("visitExpr");
        Expr expr = new Expr();
        if(ctx.literal_value()!=null){
            expr.setLiteral_value(visitLiteral_value(ctx.literal_value()));
        }
        if(ctx.database_name()!=null){
            expr.setDataBaseName(visitDatabase_name(ctx.database_name()));
        }
        if(ctx.table_name()!=null){
            expr.setTableName(visitTable_name(ctx.table_name()));
        }
        if(ctx.column_name()!=null)
        {
            expr.setColumnName(visitColumn_name(ctx.column_name()));
        }
        if(ctx.unary_operator()!=null && ctx.expr()!=null){
            System.out.println("hy");
        }
        if (ctx.commn_expr_opreator()!=null ){
            System.out.println("have expr opreator fill left and right");
            expr.setLeft(visitExpr(ctx.expr(0)));
            System.out.println("fill left");
            (expr).setRight(visitExpr(ctx.expr(1)));
            System.out.println("fill right");
        }
        return expr;
    }




    @Override public Literal_Value visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        System.out.println("visitLiteral_value");
        Literal_Value literal_value = new Literal_Value();
        if(ctx.BLOB_LITERAL()!=null){
            literal_value.setReturnType(ctx.BLOB_LITERAL().getText());
        }
        else if(ctx.NUMERIC_LITERAL()!=null){
            literal_value.setReturnType(ctx.NUMERIC_LITERAL().getText());
            System.out.println("th number is : " +literal_value.getReturnType() );
        }
        else if (ctx.K_CURRENT_TIME()!=null){
            literal_value.setReturnType(ctx.K_CURRENT_TIME().getText());
        }
        else if( ctx.K_CURRENT_DATE()!=null){
            literal_value.setReturnType(ctx.K_CURRENT_DATE().getText());
        }
        else if(ctx.K_NULL()!=null){
            literal_value.setReturnType(ctx.K_NULL().getText());
        }
        else if(ctx.K_CURRENT_TIMESTAMP()!=null){
            literal_value.setReturnType(ctx.K_CURRENT_TIMESTAMP().getText());
        }
        else if (ctx.STRING_LITERAL()!=null){
            literal_value.setReturnType(ctx.STRING_LITERAL().getText());
        }
        return literal_value;
    }

    @Override public ComonExprOpreator visitCommn_expr_opreator(SQLParser.Commn_expr_opreatorContext ctx) {
        System.out.println("visitCommn_expr_opreator");
        ComonExprOpreator comonExprOpreator = new ComonExprOpreator();
        comonExprOpreator.setOpreator(ctx.getText());
        System.out.println("the opreator is : "+comonExprOpreator.getOpreator());
        return comonExprOpreator;
    }

    @Override public Unary_Operator visitUnary_operator(SQLParser.Unary_operatorContext ctx) {
        System.out.println("visitUnary_operator");
        Unary_Operator unary_operator = new Unary_Operator();
        unary_operator.setOperator(ctx.getText());
        return unary_operator;
    }

//    -----------------------------------------------------join-------------------------------------------------




//    -----------------------------------------------names----------------------------------------

    @Override public FkTarget_ColumnName visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx)
    {
        System.out.println("visitFk_target_column_name");
        FkTarget_ColumnName fkTarget_columnName = new FkTarget_ColumnName();
        fkTarget_columnName.setName(ctx.getText());
        return  fkTarget_columnName;
    }

    @Override public ForeignTable visitForeign_table(SQLParser.Foreign_tableContext ctx)
    {
        System.out.println("visitForeign_table");
        ForeignTable foreignTable = new ForeignTable();
        foreignTable.setName(ctx.use_random_name().RANDOM_NAME().getText());
        return foreignTable;
    }

    @Override public DataBaseName visitDatabase_name(SQLParser.Database_nameContext ctx) {
        System.out.println("visitDatabase_name");
        DataBaseName dataBaseName= new DataBaseName();
        dataBaseName.setName(ctx.use_random_name().RANDOM_NAME().getText());
        return dataBaseName;
    }
    @Override public Name visitName(SQLParser.NameContext ctx) {
        System.out.println("visitName");
        Name name= new Name();
        name.setName(ctx.use_random_name().RANDOM_NAME().getText());
        System.out.println("the Name is : "+name.getName());
        return name;
    }
    @Override public Fk_Origin_Column_Name visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx)
    {
        System.out.println("visitFk_origin_column_name");
        Fk_Origin_Column_Name fk_origin_column_name = new Fk_Origin_Column_Name();
        fk_origin_column_name.setName(ctx.getText());
        System.out.println("the fk_origin name : is "+fk_origin_column_name.getName());
        return fk_origin_column_name ;}

    @Override public TableName visitTable_name(SQLParser.Table_nameContext ctx)
    {
        System.out.println("visitTable_name");
        TableName tableName = new TableName();
        tableName.setName(ctx.use_random_name().RANDOM_NAME().getText());
        System.out.println("the table name is : "+tableName.getName());
        return tableName;
    }

    @Override public ColumnName visitColumn_name(SQLParser.Column_nameContext ctx) {
        System.out.println("visitColumn_name");
        ColumnName columnName = new ColumnName();
        columnName.setName(ctx.use_random_name().RANDOM_NAME().getText());
        System.out.println("the column name is : "+columnName.getName());
        return columnName;
    }

    @Override public FunctionName visitFunction_name(SQLParser.Function_nameContext ctx) {
        System.out.println("visitFunction_name");
        FunctionName functionName= new FunctionName();
        functionName.setName(ctx.use_random_name().RANDOM_NAME().getText());
        System.out.println("the function name is : "+functionName.getName());
        return functionName;
    }
    @Override public IndexName visitIndex_name(SQLParser.Index_nameContext ctx) {
        System.out.println("visitIndex_name");
        IndexName indexName = new IndexName();
        indexName.setName(ctx.use_random_name().RANDOM_NAME().getText());
        System.out.println("the index Name name is : "+indexName.getName());
        return indexName;
    }
    @Override public QualifiedTableName visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx) {
        System.out.println("visitQualified_table_name");
        QualifiedTableName qualifiedTableName = new QualifiedTableName();
        if(ctx.database_name()!=null){
            qualifiedTableName.setDataBaseName(visitDatabase_name(ctx.database_name()));
        }
        if(ctx.table_name()!=null){
            qualifiedTableName.setTableName(visitTable_name(ctx.table_name()));
        }
        if(ctx.index_name()!=null){
            qualifiedTableName.setIndexName(visitIndex_name(ctx.index_name()));
        }

        return qualifiedTableName;
    }
    @Override public Column_alias visitColumn_alias(SQLParser.Column_aliasContext ctx)
    {
        System.out.println("visitColumn_alias");
        Column_alias column_alias = new Column_alias();
        if(ctx.IDENTIFIER()!=null){
            column_alias.setContant(ctx.IDENTIFIER().getText());
        }
        else if(ctx.STRING_LITERAL()!=null){
            column_alias.setContant(ctx.STRING_LITERAL().getText());
        }
        else if(ctx.use_random_name()!=null){
            column_alias.setContant(ctx.use_random_name().RANDOM_NAME().getText());
        }
        return column_alias ;
    }

    @Override public Table_alias visitTable_alias(SQLParser.Table_aliasContext ctx) {
        System.out.println("visitTable_alias");
        Table_alias table_alias = new Table_alias();
        if(ctx.IDENTIFIER()!=null){
            table_alias.setName(ctx.IDENTIFIER().getText());
            System.out.println("the table alias is : "+table_alias.getName());
        }
        return table_alias;
    }


    @Override public  Object visitAny_name(SQLParser.Any_nameContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitKeyword(SQLParser.KeywordContext ctx) { return visitChildren(ctx); }




    public FunctionDeclaration visitFuntion(SQLParser.FuntionContext ctx) {
        System.out.println("function declaration ");
        FunctionDeclaration funcdec = new FunctionDeclaration();
        funcdec.setHeader(visitFunction_header(ctx.function_header()));
        funcdec.setBody(visitFunction_body(ctx.function_body()));

        return funcdec;
        // we should also visite function body also
    }
    // @Override public function_body visitFunction_body(SQLParser.Function_bodyContext ctx) {
    //   System.out.println("function header ");
    // function_body body = new function_body();
    //body.setGeneral(visitGrnral_creating(ctx.));
    //return body ;
    //}

    public function_header visitFunction_header(SQLParser.Function_headerContext ctx) {
        System.out.println("function_header ");
        function_header header = new function_header();
        header.setName(visitUse_random_name(ctx.use_random_name()));
        //System.out.println( " the value here "+ctx.args().size());
        for (int i = 0; i < ctx.args().size(); i++) {
            //header.additemtoarglist();
            //header.setArg((List<args>) visitArgs(ctx.args().get(i)));
            //System.out.println(  " what will return "+ctx.args().get(i).grnral_creating().creat_without_assign().create_varible_without_assign().varible_name().use_random_name().RANDOM_NAME().getSymbol().getText());
            //header.additemtoarglist(ctx.args().get(i));
            header.additemtoarglist(visitArgs(ctx.args(i)));

        }
        System.out.println("testing ");
        System.out.println("size of array list "+header.getArg().size());
        // header.pri();
        // we should use for loop
        // set list of parameteres



        return header;
    }
    @Override
    public String  visitUse_random_name(SQLParser.Use_random_nameContext ctx) {
        System.out.println("visitUse_random_name");
        String name ="";
        if(ctx.RANDOM_NAME()!= null)
        {
            name = ctx.RANDOM_NAME().getSymbol().getText();

        }

        System.out.println(name );
        return name ;
    }

    @Override
    public function_body visitFunction_body(SQLParser.Function_bodyContext ctx) {
        System.out.println("visit function body");
        function_body function_body = new function_body();
        instructions ins ;
        for(int i =0 ; i<ctx.sub_function_body().instructions().size() ; i++)
        {
            function_body.addInstraction(visitInstructions(ctx.sub_function_body().instructions(i)));
        }
        for(int i =0 ; i<ctx.sub_function_body().instructions().size() ; i++)
        {
            // System.out.println("------------------"+function_body.getInstructions().get(i).getInstrucation_name());
         /* System.out.println(((While_Rule)function_body.getInstructions().get(2)).getBoolean_infunction_statment()
                  .getBoolean_exprs().get(0).getBoolean_exprs_list().get(0).getTermenal_node());
            System.out.println("return rule test :"+((if_else)function_body.getInstructions().get(0)).getLoop());*/
        }
        return function_body;
    }

    @Override
    public instructions visitFunctional_instruction(SQLParser.Functional_instructionContext ctx) {
        functional_instuctions instructions = new functional_instuctions();

        if(ctx.while_rule() != null)
        {
            instructions =  visitWhile_rule(ctx.while_rule());
            for (int i = 0; i <ctx.instructions().size() ; i++) {
                instructions.getInstructions().add(visitInstructions(ctx.instructions(i)));
            }
        }
        else if(ctx.foreach() != null) {
            instructions = visitForeach(ctx.foreach());
            for (int i = 0; i < ctx.instructions().size(); i++) {
                instructions.getInstructions().add(visitInstructions(ctx.instructions(i)));
            }
        } else if(ctx.for_loop_rule() != null) {
            instructions = visitFor_loop_rule(ctx.for_loop_rule());
            for (int i = 0; i < ctx.instructions().size(); i++) {
                instructions.getInstructions().add(visitInstructions(ctx.instructions(i)));
            }
        }
        return instructions;
    }
    /*  @Override
      public instructions visitNonfunctional_instruction(SQLParser.Nonfunctional_instructionContext ctx) {
          System.out.println("visit nonfunctional instruction");
          non_functional_instructions instruction = new non_functional_instructions();

          if(ctx.use_random_name() != null)
          {
              instruction = visitOne_line_if_statment_rule(ctx.one_line_if_statment_rule());
          }
          return instruction;
      }*/
    @Override public args visitArgs(SQLParser.ArgsContext ctx) {
        //List<args> arg = new ArrayList<args>();
        args temp = new  args ();
        System.out.println("visite args ");
        // arg.add(visitGrnral_creating(ctx.grnral_creating(0)));

        /// arg.add(visitGrnral_creating(ctx.grnral_creating()));
        /*if(ctx.creat_without_assign()!=null)
        { temp.setCreating(visitGrnral_creating(ctx.grnral_creating()));  //todo general_creating error

        }*/


        // return arg;
        return temp;
    }

    //@Override public createarrywithoutassign visitCreate_Array_without_assign(SQLParser.Create_Array_without_assignContext ctx) {
    //  System.out.println("create Array wihtout assign ");
    //createarrywithoutassign arra = new createarrywithoutassign();



    //}
    @Override public gneralcreating visitGrnral_creating(SQLParser.Grnral_creatingContext ctx) {
        System.out.println("general creating ");

        gneralcreating general = new gneralcreating();
        if(ctx.creat_without_assign()!=null)
        { general.setWihtoutassig(visitCreat_without_assign(ctx.creat_without_assign()));}
        else if (ctx.creating_with_assign()!=null)
        {
            general.setWithassign(visitCreating_with_assign(ctx.creating_with_assign()));

        }
        return general;
    }
    @Override public create_with_assign visitCreating_with_assign(SQLParser.Creating_with_assignContext ctx) {
        System.out.println("visit create with assign ");
        create_with_assign with  = new create_with_assign();

        if(ctx.create_json_with_assign()!=null)
        {

            with.setJson_wiht_assign(visitCreate_json_with_assign(ctx.create_json_with_assign()));

        }
       else if(ctx.create_Array_with_assign()!=null)
        {

            visitCreate_Array_with_assign(ctx.create_Array_with_assign());

        }
       else if(ctx.create_varible_with_assign() != null)
        {
            visitAssign_varible(ctx.create_varible_with_assign().assign_varible());
        }
        return with;
    }
    @Override public create_array_wiht_assign visitCreate_Array_with_assign(SQLParser.Create_Array_with_assignContext ctx) {
        create_array_wiht_assign create = new create_array_wiht_assign() ;
        System.out.println("visite create array with assign ");
        create.setIndex(visitArray_base_form_without_index(ctx.array_base_form_without_index()));
        create.setSide(visitLeft_side_array(ctx.left_side_array()));
        return create ;


    }
    @Override public array_left_side visitLeft_side_array(SQLParser.Left_side_arrayContext ctx) {
        array_left_side leftside = new array_left_side();
        leftside.setForm(visitValue_left_side(ctx.value_left_side()));
        System.out.println("visite array_left_side");
        return leftside;
    }
    @Override public array_value_form visitValue_left_side(SQLParser.Value_left_sideContext ctx) {
        int i=0;
        array_value_form leftvalue  = new array_value_form();
        System.out.println(" value is the array");
        if(ctx.array_identifier_form()!=null)
        ///  {leftvalue.setID(visitArray_identifier_form(ctx.array_identifier_form()));}
        {
            leftvalue.setID(visitArray_identifier_form(ctx.array_identifier_form()));

            for( i=0;i<leftvalue.getID().size();i++)
                System.out.println( " value in index  "+i+leftvalue.getID().get(i).getText());
        }
        if(ctx.array_charecter_form()!=null)
        {
            leftvalue.setID(visitArray_charecter_form(ctx.array_charecter_form()));
            for(i=0;i<leftvalue.getID().size();i++)
            {
                System.out.println( " value in index "+i+leftvalue.getID().get(i).getText());
            }

        }
        if(ctx.array_objects_form()!=null)
        {
            leftvalue.setStatment(visitArray_objects_form(ctx.array_objects_form()));

        }
        if(ctx.array_objects_form2()!=null)
        {
            leftvalue.setStatment(visitArray_objects_form2(ctx.array_objects_form2()));
        }
        if(ctx.array_arrayes_form()!=null)
        {
            leftvalue.setArrayfor(visitArray_arrayes_form(ctx.array_arrayes_form()));
        }


        return leftvalue;
    }
    @Override public  ArrayList<jsonstatment>   visitArray_objects_form(SQLParser.Array_objects_formContext ctx) {
        ArrayList<jsonstatment > j = new  ArrayList<jsonstatment >();
        for(int i=0;i<ctx.json_statment().size();i++)
        {

            j.add(visitJson_statment(ctx.json_statment(i)));
            System.out.println("value of json statment in list "+"in the index "+i+ctx.json_statment(i).getText().toString());
        }
        return j;
    }
    @Override public ArrayList<jsonstatment>  visitArray_objects_form2(SQLParser.Array_objects_form2Context ctx) {
        System.out.println("visit array object form 2 ");
        ArrayList<jsonstatment> t = new   ArrayList<jsonstatment>();
        t=visitArray_objects_form(ctx.array_objects_form());
        return t;
    }
    @Override public ArrayList<Token>  visitArray_identifier_form(SQLParser.Array_identifier_formContext ctx) {
        ArrayList<Token > t = new  ArrayList<Token >();

        for(int i=0;i<ctx.IDENTIFIER().size();i++)
        {

            t.add(ctx.IDENTIFIER(i).getSymbol());
        }
        return t;
    }
    @Override public array_array_form visitArray_arrayes_form(SQLParser.Array_arrayes_formContext ctx) {
        System.out.println("visite array of array form ");
        array_array_form forms = new array_array_form();
        for(int i=0;i<ctx.left_side_array().size();i++)
        {
            forms.adding(visitLeft_side_array(ctx.left_side_array(i)));
        }
        for(int i=0;i<ctx.left_side_array().size();i++)
        {
            System.out.println( " the value in th index "+i+ctx.left_side_array(i).toString());

        }
        return forms;
    }
    /* @Override public  ArrayList<Token> visitArray_integer_form(SQLParser.Array_integer_formContext ctx) {
         ArrayList<Token > t = new  ArrayList<Token >();

         for(int i=0;i<ctx..size();i++)
         {

             t.add(ctx.IDENTIFIER(i).getSymbol());
         }
         return t;
     }


     }*/ // arithmatic one we need it ......
    @Override public ArrayList<Token> visitArray_charecter_form(SQLParser.Array_charecter_formContext ctx) {
        ArrayList<Token > t = new  ArrayList<Token >();

        for(int i=0;i<ctx.ONE_CHAR_LETTER().size();i++)
        {

            t.add(ctx.COMMA(i).getSymbol());
        }
        return t;

    }
    @Override public creat_json_with_assign visitCreate_json_with_assign(SQLParser.Create_json_with_assignContext ctx) {
        System.out.println("visite create json wiht assign ");
        creat_json_with_assign jsowith = new creat_json_with_assign();
        // if else = {}
        //else visite use randomname
        jsowith.setAssingit(visitAssign_json(ctx.assign_json()));

        return jsowith;
    }
    @Override public jsonassign visitAssign_json(SQLParser.Assign_jsonContext ctx) {
        System.out.println("visite assign json ");
        jsonassign assjsoin = new jsonassign();
        assjsoin.setForm(visitJson_name(ctx.json_name(0)));
        if(ctx.json_statment()!=null) {
            assjsoin.setJson(visitJson_statment(ctx.json_statment()));

        }
        System.out.println(" json name "+ctx.json_name(0).getText());
        if(ctx.json_name(1)!=null) {
            System.out.println("json value " + ctx.json_name(1).getText());
            assjsoin.setForm(visitJson_name(ctx.json_name(1)));
        }
        return assjsoin;
    }
    @Override public jsonstatment visitJson_statment(SQLParser.Json_statmentContext ctx) {
        System.out.println("visit json statment ");
        jsonstatment inside_json = new jsonstatment();
        for(int i=0;i<ctx.inside_json_statmnet().size();i++)
        {
            inside_json.additemtojsonstatment(visitInside_json_statmnet(ctx.inside_json_statmnet().get(i)));
            //System.out.println(" justing testing it "+ctx.inside_json_statmnet().get(i).getText());
        }

        return inside_json;
    }

    @Override public inside_json_statmnet visitInside_json_statmnet(SQLParser.Inside_json_statmnetContext ctx) {
        System.out.println("visite inside json statment ");
        inside_json_statmnet inside = new inside_json_statmnet();
        inside.setName(visitUse_random_name(ctx.use_random_name()));
        inside.setValue( visitValue_json_statmnet(ctx.value_json_statmnet()));
        if(inside.getName()!=null && inside.getValue()!=null)
        {
            System.out.println( "variable name "+inside.getName());
            if(inside.getValue().getStatmnet()!=null )
            {
                System.out.println(" the value will be "+inside.getValue().getStatmnet().getName());
            }
            if(inside.getValue().getTypes()!=null)
                System.out.println("the value will be "+inside.getValue().getTypes().getText());

        }
        return inside;
    }
    @Override public return_type visitReturn_type(SQLParser.Return_typeContext ctx) {
        System.out.println("visit return type ");
        return_type t = new return_type();
        if (ctx.IDENTIFIER() != null) {
            System.out.println(" visit identifier " + ctx.IDENTIFIER().getSymbol().getText());
            t.setTt(ctx.IDENTIFIER().getSymbol());
        }
        if (ctx.K_FALSE() != null) {
            System.out.println(" visit false  " + ctx.K_FALSE().getSymbol().getText());
            t.setTt(ctx.K_FALSE().getSymbol());
        }
        if (ctx.K_TRUE() != null) {
            t.setTt(ctx.K_TRUE().getSymbol());
            System.out.println(" visit true " + ctx.K_TRUE().getSymbol().getText());
        }
        if (ctx.K_NULL() != null) {

            t.setTt(ctx.K_NULL().getSymbol());
            System.out.println(" visit null " + ctx.K_NULL().getSymbol().getText());
        }
        if (ctx.arithmetic_expr() != null) {
            System.out.println(" visit arthmatic  ");
            t.setArithmatic(visitArithmetic_expr(ctx.arithmetic_expr()));

        }
        if (ctx.arithmetic_infunction_statment() != null) {
            System.out.println(" visit arithmatic infunction ");
            t.setArithmatic(visitArithmetic_expr(ctx.arithmetic_expr()));
        }
        if (ctx.array_base_form_with_index() != null) {
            System.out.println(" visit array base form ");
            t.setWihindex(visitArray_base_form_with_index(ctx.array_base_form_with_index()));

        }
        if (ctx.call_function() != null) {
            System.out.println(" visit call function ");
            t.setCall(visitCall_function(ctx.call_function()));
        }
        if (ctx.assign_array() != null)
        {
            System.out.println(" visit assign array");
            t.setA(visitAssign_array(ctx.assign_array()));
        }
        if(ctx.assign_json()!=null){
            System.out.println(" visit assign json ");
            t.setAssign(visitAssign_json(ctx.assign_json()));
        }
        if(ctx.assign_varible()!=null)
        {
            System.out.println(" visit assign variable");
            t.setV(visitAssign_varible(ctx.assign_varible()));
        }
        if(ctx.boolean_infunction_statment()!=null)
        {
            System.out.println("visit boolean ");
            t.setBooleanes(visitBoolean_infunction_statment(ctx.boolean_infunction_statment()));
        }
        if(ctx.varible_name() != null){
            System.out.println("visit variable name in return type");
            t.setName(visitUse_random_name(ctx.varible_name().use_random_name()));
        }



        return t ;
    }
    @Override public returnes_rule visitReturn_rule(SQLParser.Return_ruleContext ctx) {
        returnes_rule rule = new returnes_rule();
        System.out.println("visit return rule");
        rule.setT(visitReturn_type(ctx.return_type()));
        return rule;

    }

    @Override public value_json_statmnet visitValue_json_statmnet(SQLParser.Value_json_statmnetContext ctx) {
        value_json_statmnet value = new value_json_statmnet();
        System.out.println("visite value json statment ");

        if(ctx.IDENTIFIER()!= null)
        {
            value.setTypes(ctx.IDENTIFIER().getSymbol());

            //System.out.println("value of identifir "+ctx.IDENTIFIER().getSymbol().getText());
        }
        else  if (ctx.K_NULL()!=null)
        {

            value.setTypes(ctx.K_NULL().getSymbol());
            //System.out.println("value of null"+ctx.K_NULL().getSymbol().getText());

        }
        else if (ctx.NUMERIC_LITERAL()!=null)
        {
            value.setTypes(ctx.NUMERIC_LITERAL().getSymbol());
            //  System.out.println("value of numeric letter "+ctx.NUMERIC_LITERAL().getSymbol().getText());
        }
        else if (ctx.json_statment()!=null)
        {
            value.setStatmnet(visitJson_statment(ctx.json_statment())); // calling it our we should assign to it
            /// System.out.println("value of json statment "+ctx.json_statment().inside_json_statmnet().);
        }
        else if (ctx.varible_name()!=null)
        {
            value.setName(visitUse_random_name(ctx.varible_name().use_random_name()));
        }
        else if (ctx.varible_from_object()!=null)
        {
            value.setObject(visitVarible_from_object(ctx.varible_from_object()));

        }
        return value;

    }
    @Override public variablefromobject visitVarible_from_object(SQLParser.Varible_from_objectContext ctx) {
        System.out.println("visite variable from object");
        variablefromobject objectes = new variablefromobject();
        if(ctx.json_name()!=null && ctx.varible_name()!=null) {

            objectes.setForm(visitJson_name(ctx.json_name()));
            //objectes.setName(visitUse_random_name(ctx.varible_name().use_random_name()));
            System.out.println("json name "+ctx.json_name());
            System.out.println("object name "+ctx.varible_name());
            //visitUse_random_name(ctx.varible_name().use_random_name()) ;
        }
        return objectes;
    }
    @Override public createwihtoutassign visitCreat_without_assign(SQLParser.Creat_without_assignContext ctx) {
        createwihtoutassign wihtoutassign = new createwihtoutassign();
        System.out.println("creating whtout assign ");
        // wihtoutassign =  visitCreate_varible_without_assign(ctx.create_varible_without_assign());
        if(ctx.create_varible_without_assign()!=null)
            wihtoutassign.setVar( visitCreate_varible_without_assign(ctx.create_varible_without_assign()));
        if(ctx.create_Array_without_assign()!=null)
            wihtoutassign.setArray(visitCreate_Array_without_assign(ctx.create_Array_without_assign()));
        if(ctx.create_json_object_without_assign()!=null)
            wihtoutassign.setJson(visitCreate_json_object_without_assign(ctx.create_json_object_without_assign()));
        return wihtoutassign;

    }
    @Override public create_json_wihtout_assign visitCreate_json_object_without_assign(SQLParser.Create_json_object_without_assignContext ctx) {
        System.out.println("visite json wihtout assign ");
        create_json_wihtout_assign json_without_assign  = new  create_json_wihtout_assign();
        json_without_assign.setForm(visitJson_name(ctx.json_name()));
        return json_without_assign;
    }
    @Override public jsonform   visitJson_name(SQLParser.Json_nameContext ctx) {
        System.out.println("json name ");
        jsonform form = new jsonform();
        //visitUse_random_name(ctx.use_random_name());
        form.setName(visitUse_random_name(ctx.use_random_name()));
        return form ;
    }
    @Override public createarrywithoutassign visitCreate_Array_without_assign(SQLParser.Create_Array_without_assignContext ctx) {
        System.out.println("creaitng array wihtout assing ");
        createarrywithoutassign wihtoutassing = new createarrywithoutassign();
        wihtoutassing.setWihtoutindex(visitArray_base_form_without_index(ctx.array_base_form_without_index()));

        return wihtoutassing;
    }
    @Override public arrayformwithoutindex visitArray_base_form_without_index(SQLParser.Array_base_form_without_indexContext ctx) {
        System.out.println("creating array base form ");
        arrayformwithoutindex wihtoutindex = new arrayformwithoutindex();
        wihtoutindex.setName(visitArray_name(ctx.array_name()));
        //System.out.println( " array name "+wihtoutindex.getName());
        return wihtoutindex;
    }
    @Override public String  visitArray_name(SQLParser.Array_nameContext ctx) {
        String name ="";
        System.out.println("visite array name ");
        name =visitUse_random_name(ctx.use_random_name());
        System.out.println("array name "+name );
        return name ;
    }
    @Override public creatingvariabelwithoutassing visitCreate_varible_without_assign(SQLParser.Create_varible_without_assignContext ctx) {
        System.out.println("creatingvariabelwithoutassing");
        creatingvariabelwithoutassing creatvaribelwihtout = new creatingvariabelwithoutassing();
        creatvaribelwihtout.setN(visitUse_random_name(ctx.varible_name().use_random_name()));
        return  creatvaribelwihtout;

    }

  @Override public exting_oop visitExiting_loops(SQLParser.Exiting_loopsContext ctx) {
      exting_oop c = new exting_oop ();
      c.setR(visitReturn_rule(ctx.return_rule()));
      return c ;
  }

    @Override
    public instructions visitInstructions(SQLParser.InstructionsContext ctx) {
        System.out.println("visit instruction");
        //System.out.println(ctx.getText());
        //System.out.println(ctx.functional_instruction().instructions(0).functional_instruction());

        instructions instructions = new instructions();
        if(ctx.functional_instruction() != null){
            if (ctx.functional_instruction().if_else_rule() != null) {
                //System.out.println(ctx.functional_instruction().if_else_rule().getText());
              instructions =  visitIf_else_rule(ctx.functional_instruction().if_else_rule());
            }
            else if (ctx.functional_instruction().do_while() != null){
                instructions = visitDo_while(ctx.functional_instruction().do_while());
            }
            else if (ctx.functional_instruction().while_rule() != null)
            {
                instructions = visitFunctional_instruction(ctx.functional_instruction());
            }
            else if (ctx.functional_instruction().foreach() != null)
            {
                instructions = visitFunctional_instruction(ctx.functional_instruction());
            }
            else if (ctx.functional_instruction().switch_rule() != null )
            {
                instructions = visitSwitch_rule(ctx.functional_instruction().switch_rule());
            }
            else if (ctx.functional_instruction().for_loop_rule() != null)
            {
                instructions = visitFor_loop_rule(ctx.functional_instruction().for_loop_rule());
            }
        }
        else if(ctx.nonfunctional_instruction() != null)
        {
            if(ctx.nonfunctional_instruction().arithmetic_infunction_statment() != null)
            {
                instructions = visitArithmetic_infunction_statment(ctx.nonfunctional_instruction().arithmetic_infunction_statment());
            }
            else if (ctx.nonfunctional_instruction().grnral_creating() != null)
            {
                instructions = visitGrnral_creating(ctx.nonfunctional_instruction().grnral_creating());
            }
            else if (ctx.nonfunctional_instruction().genral_assign() != null)
            {
                instructions = visitGenral_assign(ctx.nonfunctional_instruction().genral_assign());
            }
            else if (ctx.nonfunctional_instruction().call_function() != null)
            {
                instructions = visitCall_function(ctx.nonfunctional_instruction().call_function());
            }
            else if ( ctx.nonfunctional_instruction().print_statment() !=  null)
            {
                instructions = visitPrint_statment(ctx.nonfunctional_instruction().print_statment());
            }
        }
        return instructions;
    }

    @Override
    public instructions visitIf_else_rule(SQLParser.If_else_ruleContext ctx) {
        System.out.println("visit if rule");
        if_else ins = new if_else();
        ins.setInstrucation_name(if_else.class.getName());
        ins.setBoolean_Infunction_Statment(visitBoolean_infunction_statment(ctx.if_rule().boolean_infunction_statment()));

        for (int j = 0; j < ins.getBoolean_Infunction_Statment().getBoolean_exprs().size(); j++) {
            System.out.print("boolean expr number :" + j + "    ");
            for (int i = 0; i < ins.getBoolean_Infunction_Statment().getBoolean_exprs().get(j).getBoolean_exprs_list().size(); i++) {

                if (ins.getBoolean_Infunction_Statment().getBoolean_exprs().get(j).getBoolean_exprs_list().get(i).getTermenal_node() != null) {
                    System.out.print(ins.getBoolean_Infunction_Statment().getBoolean_exprs().get(j).getBoolean_exprs_list().get(i).getTermenal_node().toString());
                } else if(ins.getBoolean_Infunction_Statment().getBoolean_exprs().get(j).getBoolean_exprs_list().get(i).getVariable_name() != null){
                    System.out.print(ins.getBoolean_Infunction_Statment().getBoolean_exprs().get(j).getBoolean_exprs_list().get(i).getVariable_name().toString());
                }
            }
            System.out.println();
        }



        if(ctx.if_rule() != null){
            for(int i =0 ; i<ctx.if_rule().instructions().size() ; i++) {
                ins.addinstruction(visitInstructions(ctx.if_rule().instructions(i)));
                }
            if(ctx.if_rule().return_rule()!=null) {
                returnes_rule r ;
                r = visitReturn_rule( ctx.if_rule().return_rule());
                exting_oop e =  new exting_oop();
                e.setR(r);
                ins.setLoop(e);
                System.out.println("****************the id for object exiting loop "+ins.getLoop());
            }
        if(ctx.else_if_rule() != null){
            for(int i =0 ; i<ctx.else_if_rule().size() ; i++) {
                //System.out.println("hiiiiiii" + ctx.else_if_rule().size() );
                System.out.println("visit else_if");
                else_if_rule else_if_rule = new else_if_rule();
                ins.add_Else_if_rule_in_if(else_if_rule);

                    System.out.println("else if:"+ ins.getElse_if());
                for(int j =0 ; j < ctx.else_if_rule().get(i).instructions().size() ; j++) {
                    //System.out.println("j:"+j );
                    else_if_rule.addinstruction(visitInstructions(ctx.else_if_rule().get(i).instructions().get(j)));

                }
            }
        }
        if(ctx.else_rulse() != null){
            System.out.println("visit else");
            else_rule else_rule = new else_rule();
            ins.setElse_rule(else_rule);
                System.out.println("else :"+ ins.getElse_rule());
            for(int i =0 ; i<ctx.else_rulse().instructions().size() ; i++) {

                else_rule.addinstruction(visitInstructions(ctx.else_rulse().instructions(i)));

            }
                }}
        return ins;
    }

    @Override
    public One_line_if visitOne_line_if_statment_rule(SQLParser.One_line_if_statment_ruleContext ctx) {
        System.out.println("visit inside one line if");
        One_line_if one_line_if = new One_line_if();
        one_line_if.setBoolean_infunction_statment(visitBoolean_infunction_statment(ctx.boolean_infunction_statment(0)));
       // one_line_if.setLeft_inside(visitInside_one_line_function(ctx.inside_one_line_function()));
        return new One_line_if();
    }

    @Override
    public Object visitInside_one_line_function(SQLParser.Inside_one_line_functionContext ctx) {
        return super.visitInside_one_line_function(ctx);
    }

    @Override
    public instructions visitPrint_statment(SQLParser.Print_statmentContext ctx) {
        System.out.println("visit Prints");
        Print print = new Print();
        print.setInstrucation_name(Print.class.getName());
    if(ctx.indisde_the_print() != null)
    {
        if(ctx.indisde_the_print() != null)
        {
            for (int i = 0; i <ctx.indisde_the_print().size() ; i++) {

                if(ctx.indisde_the_print().get(i) != null)
                {
                    print.getPrints().add(visitIndisde_the_print(ctx.indisde_the_print().get(i)));
                }
            }
        }

    }
        return print;
    }

    @Override
    public Inside_the_print visitIndisde_the_print(SQLParser.Indisde_the_printContext ctx) {
        System.out.println("visit inside print");
        Inside_the_print inside_the_print = new Inside_the_print();

           if(ctx.varible_from_object() != null)
           {
               inside_the_print.setVariable_from_object(visitVarible_from_object(ctx.varible_from_object()));
               System.out.println(inside_the_print.getVariable_from_object());
           }
           else if(ctx.IDENTIFIER() != null)
           {
               inside_the_print.setIdentifire(ctx.IDENTIFIER().getText());
               System.out.println(inside_the_print.getIdentifire());
           }
           else if(ctx.array_base_form_with_index() != null)
           {
               inside_the_print.setArray_base_with_index(visitArray_base_form_with_index(ctx.array_base_form_with_index()));
               System.out.println(inside_the_print.getArray_base_with_index());
           }
           else if(ctx.use_random_name() != null)
           {
               inside_the_print.setVariable_name(visitUse_random_name(ctx.use_random_name()));
               System.out.println(inside_the_print.getVariable_name());
           }
           else if(ctx.call_function() != null)
           {
               inside_the_print.setCallFunction(visitCall_function(ctx.call_function()));
               System.out.println(inside_the_print.getCallFunction());
           }

        return inside_the_print;
    }

    @Override
    public instructions visitDo_while(SQLParser.Do_whileContext ctx) {
        System.out.println("visit do while");
        do_while ins = new do_while();
        ins.setInstrucation_name(do_while.class.getName());
        ins.setBoolean_infunction_statment(visitBoolean_infunction_statment(ctx.while_rule().boolean_infunction_statment()));
        for (int i = 0; i <ctx.instructions().size() ; i++) {
            ins.addinstruction(visitInstructions(ctx.instructions(i)));
        }
        return ins;
    }

    @Override
    public functional_instuctions visitFor_loop_rule(SQLParser.For_loop_ruleContext ctx) {
        System.out.println("visit for rule");
        For_Loop_Rule for_loop_rule = new For_Loop_Rule();
        for_loop_rule.setInstrucation_name(For_Loop_Rule.class.getName());
        if(ctx.boolean_infunction_statment() != null)
        {
            for_loop_rule.setBoolean_infunction_statment(visitBoolean_infunction_statment(ctx.boolean_infunction_statment()));
        }
        if(ctx.inside_for_loop(0) != null)
        {
            for_loop_rule.setLeft_inside_for_loop(visitInside_for_loop(ctx.inside_for_loop(0)));
            System.out.println("visit left");
        }
        if(ctx.inside_for_loop(1) != null)
        {
            for_loop_rule.setRight_inside_for_loop(visitInside_for_loop(ctx.inside_for_loop(1)));
            System.out.println("visit right");
        }
        return for_loop_rule;
    }

    @Override
    public Inside_for_loop visitInside_for_loop(SQLParser.Inside_for_loopContext ctx) {
        System.out.println("visit inside for");
        Inside_for_loop inside_for_loop = new Inside_for_loop();
        if(ctx.assign_array() != null){
            inside_for_loop.setAssign_array(visitAssign_array(ctx.assign_array()));
        }
        else if (ctx.assign_varible() != null)
        {
         inside_for_loop.setVar(visitAssign_varible(ctx.assign_varible()));
        }
        else if (ctx.shortcut_statments() != null)
        {
         inside_for_loop.setShortcut_statments(ctx.shortcut_statments().getText());
        }
        else if (ctx.create_Array_without_assign() != null)
        {
         inside_for_loop.setCreate_arry_without_assign(visitCreate_Array_without_assign(ctx.create_Array_without_assign()));
        }
        return inside_for_loop;
    }

    @Override
    public functional_instuctions visitWhile_rule(SQLParser.While_ruleContext ctx) {
        System.out.println("visit while");
        While_Rule ins = new While_Rule();
        ins.setInstrucation_name(While_Rule.class.getName());
        ins.setBoolean_infunction_statment(visitBoolean_infunction_statment(ctx.boolean_infunction_statment()));
        return ins;
    }

    @Override
    public functional_instuctions visitForeach(SQLParser.ForeachContext ctx) {
        System.out.println("visit Foreach");
        Foreach ins = new Foreach();
        ins.setInstrucation_name(Foreach.class.getName());
        ins.setLoop_variable(visitUse_random_name(ctx.use_random_name(0)));
        ins.setLoop_variable(visitUse_random_name(ctx.use_random_name(1)));

        return ins;
    }

    @Override
    public CallFunction visitCall_function(SQLParser.Call_functionContext ctx) {
        System.out.println("visit call function");
        CallFunction ins = new CallFunction();
        ins.setInstrucation_name(CallFunction.class.getName());
        ins.setFunction_name(ctx.use_random_name().getText());
        for (int i = 0; i <ctx.prameters().size() ; i++) {
            ins.getParameters().add(visitPrameters(ctx.prameters(i)));
        }
        return ins;
    }

    @Override
    public Parameter visitPrameters(SQLParser.PrametersContext ctx) {
        System.out.println("visist parametar");
        Parameter parameter = new Parameter();

        if(ctx.NUMERIC_LITERAL()!= null)
            parameter.setNumber(ctx.NUMERIC_LITERAL().getText());
        else if(ctx.IDENTIFIER() != null)
        {
            parameter.setIdentifire(ctx.IDENTIFIER().getText());
        } else if(ctx.call_function() != null)
        {
            parameter.setCallFunction(visitCall_function(ctx.call_function()));
        }  else if(ctx.use_random_name() != null)
        {
            parameter.setVariable_name(visitUse_random_name(ctx.use_random_name()));
        }  else if(ctx.array_base_form_with_index() != null)
        {
            parameter.setArray_base_with_index(visitArray_base_form_with_index(ctx.array_base_form_with_index()));
        }  else if(ctx.varible_from_object() != null)
        {
            parameter.setVariable_from_object(visitVarible_from_object(ctx.varible_from_object()));
        }
        else if (ctx.ONE_CHAR_LETTER() != null)
        {
            parameter.setOne_char(ctx.ONE_CHAR_LETTER().getText());
        }
        else if (ctx.genral_assign() != null)
        {
            parameter.setGeneral_assign(visitGenral_assign(ctx.genral_assign()));
        }
        return parameter;
    }

    @Override
    public assignment visitGenral_assign(SQLParser.Genral_assignContext ctx) {
        System.out.println("general creating");
        assignment ins = new assignment();
        ins.setInstrucation_name(assignment.class.getName());

        if(ctx.assign_varible() != null)
        {
            ins.setVar(visitAssign_varible(ctx.assign_varible()));
        }
        else if (ctx.assign_array() != null)
        {
            ins.setArray(visitAssign_array(ctx.assign_array()));
        }
        else if (ctx.assign_json() != null)
        {
            ins.setJson(visitAssign_json(ctx.assign_json()));
        }
        return ins;
    }

    @Override
    public assign_variable visitAssign_varible(SQLParser.Assign_varibleContext ctx) {
        System.out.println("visit variable creating");
        assign_variable var = new assign_variable();
        if(ctx.arithmetic_expr() != null)
        {
            var.setArithmatic_expr(visitArithmetic_expr(ctx.arithmetic_expr()));
        }
         if (ctx.boolean_infunction_statment() != null)
        {
            var.setBoolean_infunction_statment(visitBoolean_infunction_statment(ctx.boolean_infunction_statment()));
        }
         if (ctx.use_random_name() != null)
        {
            for (int i = 0; i <ctx.use_random_name().size() ; i++) {
                Variable_with_opretor variable_with_opretor = new Variable_with_opretor();
                variable_with_opretor.setVariable_name(visitUse_random_name(ctx.use_random_name().get(i)));
                if(ctx.any_arithmetic_oprator()!= null && ctx.any_arithmetic_oprator().size() != 0)
                {
                    variable_with_opretor.setOperator(ctx.any_arithmetic_oprator().get(i).getText());
                }
                var.getVariable_with_opretor().add(variable_with_opretor);
            }
        }

        return var;
    }

    @Override
    public assign_Array visitAssign_array(SQLParser.Assign_arrayContext ctx) {
        System.out.println("visit assign_array");
        assign_Array arry = new assign_Array();

            Array_base_form_with_operetor array_base_form_with_operetor = new Array_base_form_with_operetor();
            array_base_fom_with_index array_base_with_index = new array_base_fom_with_index();
        if(ctx.array_base_form_with_index() != null)
        {
            for (int i = 0; i < ctx.any_arithmetic_oprator().size(); i++) {
                if(ctx.any_arithmetic_oprator() != null)
                {
                    if(ctx.any_arithmetic_oprator().get(i) != null)
                        array_base_form_with_operetor.setOpretor(ctx.any_arithmetic_oprator().get(i).getText());
                }
            }
            for (int i = 0; i < ctx.array_base_form_with_index().size(); i++) {

                array_base_form_with_operetor.getArray_base_fom().add(visitArray_base_form_with_index(ctx.array_base_form_with_index(i)));
                arry.getArray_base_form_with_operetors().add(array_base_form_with_operetor);
            }
        }
        if(ctx.arithmetic_expr() != null)
        {
            arry.setArithmatic_expr(visitArithmetic_expr(ctx.arithmetic_expr()));
        }
        else if(ctx.boolean_infunction_statment() != null)
        {
            arry.setBoolean_infunction_statment(visitBoolean_infunction_statment(ctx.boolean_infunction_statment()));
        }
        return arry;
    }

    @Override
    public array_base_fom_with_index visitArray_base_form_with_index(SQLParser.Array_base_form_with_indexContext ctx) {

            System.out.println("visit Array base form with index ");
            array_base_fom_with_index array_base_with_index = new array_base_fom_with_index();
            Array_base_form_variables array_base_form_variables = new Array_base_form_variables();
            for (int j = 0; j <ctx.NUMERIC_LITERAL().size() ; j++) {
                if(ctx.NUMERIC_LITERAL() != null )
                {
                    array_base_form_variables.setNumber(ctx.NUMERIC_LITERAL().get(j).getText());
                }
                for (int i = 0; i <ctx.varible_name().size() ; i++) {
                     if(ctx.varible_name() != null)
                    {
                        array_base_form_variables.setVariable_name(visitUse_random_name(ctx.varible_name().get(j).use_random_name()));
                    }
                }
                for (int i = 0; i <ctx.arithmetic_expr().size() ; i++) {

                    if(ctx.arithmetic_expr().get(j) != null)
                    {
                        array_base_form_variables.setArithmatic_expr(visitArithmetic_expr(ctx.arithmetic_expr().get(j)));
                    }
                }
                for (int i = 0; i < ctx.arithmetic_infunction_statment().size(); i++) {
                     if(ctx.arithmetic_infunction_statment().get(j) != null)
                    {
                        array_base_form_variables.setArithmetic_infunction_statment(visitArithmetic_infunction_statment(ctx.arithmetic_infunction_statment().get(j)));
                    }
                }
                array_base_with_index.getArray_base_form_variables().add(array_base_form_variables);
            }
        return array_base_with_index;
    }

    ArrayList<SQLParser.Arithmetic_exprContext> arithmetic_expr_tree = new ArrayList<>();
    ArrayList<SQLParser.Arithmetic_exprContext> arithmetic_expr_tree_op = new ArrayList<>();
    Stack<SQLParser.Boolean_exprContext> boolean_expr_tree = new Stack<>();
    @Override
    public Arithmatic_expr  visitArithmetic_expr(SQLParser.Arithmetic_exprContext ctx) {
        System.out.println("visit artmatic EXPR");
        Arithmatic_expr arithmatic_expr = new Arithmatic_expr();


        DFS_arthmatic_expr(ctx);
        arithmatic_expr =  Arithmatics( arithmatic_expr );

        expression_algorthim(ctx);

        /*for (int i = 0; i < arithmatic_expr.getArithmatic_exprs_list().size(); i++) {
            if(arithmatic_expr.getArithmatic_exprs_list().get(i).getTermenal_node() != null)
                System.out.print(arithmatic_expr.getArithmatic_exprs_list().get(i).getTermenal_node() + " ");
            else if (arithmatic_expr.getArithmatic_exprs_list().get(i).getVariable_name() != null)
                System.out.print(arithmatic_expr.getArithmatic_exprs_list().get(i).getVariable_name()+ " ");
        }*/
        for (int i = 0; i < arithmatic_expr.getArithmatic_exprs_list().size(); i++) {
            if(arithmatic_expr.getArithmatic_exprs_list().get(i).getTermenal_node() != null)
                System.out.print(arithmatic_expr.getArithmatic_exprs_list().get(i).getTermenal_node() + " " );
            if(arithmatic_expr.getArithmatic_exprs_list().get(i).getVariable_name() != null)
                System.out.print(arithmatic_expr.getArithmatic_exprs_list().get(i).getVariable_name()+ " ");
        }
        /*
        while (!arithmetic_expr_tree.isEmpty())
        {

            SQLParser.Arithmetic_exprContext temp = arithmetic_expr_tree.pop();
            Arithmatic_expr termenal_expr = new Arithmatic_expr();

            if(temp.arithmetic_expr(0) == null){
                if(temp.NUMERIC_LITERAL() != null){
                    termenal_expr.setTermenal_node(temp.NUMERIC_LITERAL().toString());
                    System.out.println("number :" +termenal_expr.getTermenal_node());
                }
                else if(temp.varible_name().use_random_name().RANDOM_NAME() != null){
                    termenal_expr.setTermenal_node(temp.varible_name().use_random_name().RANDOM_NAME().getText());
                    System.out.println("var :" +termenal_expr.getTermenal_node());
                }
                arithmatic_expr.getArithmatic_exprs_list().add(termenal_expr);
            }
            System.out.println();
        }*/
                  return arithmatic_expr;

    }
    public boolean fill_arth_expr(SQLParser.Arithmetic_exprContext ctx , int level ,HashSet visited ){
        if(ctx == null) {
            return false;
        }
        if(level == 1 )
        {
            System.out.println(level+"------------- :" + ctx.getText());




            arithmetic_expr_tree.add(ctx);

                return true;

        }
        //if(ctx.children.get(0).getClass().getName() != "SQLParser.Arithmetic_exprContext")return false;

        boolean left = fill_arth_expr(ctx.arithmetic_expr(1), level - 1 ,visited);
        boolean right = fill_arth_expr(ctx.arithmetic_expr(0), level - 1 , visited);
        return left || right;
    }
    public void DFS_arthmatic_expr (SQLParser.Arithmetic_exprContext ctx  )
    {
        int level = 1 ;

        System.out.println("niggars :"+ctx.getChildCount());
        System.out.println("niggarsD :"+ctx.depth());
        System.out.println("niggarsc :" + ctx.children);
        System.out.println("niggars0 :" + ctx.arithmetic_expr(0).getText());
        System.out.println("niggars1 :" + ctx.arithmetic_expr(1).getText());
        String x = ((SQLParser.Arithmetic_exprContext)ctx.children.toArray()[0]).getText();


        HashSet<SQLParser.Arithmetic_exprContext> visited = new HashSet<SQLParser.Arithmetic_exprContext>();
        while(fill_arth_expr(ctx , level , visited)){
            //System.out.println("enter t");
            level++;
        }
    }
    public void expression_algorthim(SQLParser.Arithmetic_exprContext ctx  ){
        Expression_List expression_list = new Expression_List();
        if(ctx.arithmetic_expr() != null) {
            for (int i = 0; i < ctx.arithmetic_expr().size(); i++) {

                Expression_List left_expr = new Expression_List();
                Expression_List right_expr = new Expression_List();

                if(i ==  0 ){
                    expression_list.setLeft_expr(left_expr);

                }
                if(i == 1){

                    expression_list.setRight_expr(right_expr);
                }
            }
        }
    }
    public void setOprator(SQLParser.Arithmetic_exprContext ctx  , Expression_List expression_list){
        if(ctx.PLUS() != null){
            expression_list.setOp(ctx.PLUS().toString());
        }
        else if(ctx.STAR() != null){
            expression_list.setOp(ctx.STAR().toString());
        }
    }

    private Arithmatic_expr Arithmatics( Arithmatic_expr arithmatic_expr){
        for (int i = 0; i <arithmetic_expr_tree.size(); i++) {


           SQLParser.Arithmetic_exprContext arithmetic_exprContext = arithmetic_expr_tree.get(i);
           arithmetic_expr_tree.remove(i);

            Arithmatic_expr termenal_expr = new Arithmatic_expr();
                if(arithmetic_exprContext.NUMERIC_LITERAL() != null){
                    termenal_expr.setTermenal_node(arithmetic_exprContext.NUMERIC_LITERAL().toString());
                    System.out.println("number :" +termenal_expr.getTermenal_node());
                }
                else if(arithmetic_exprContext.varible_name() != null){
                    termenal_expr.setVariable_name(visitUse_random_name(arithmetic_exprContext.varible_name().use_random_name()));
                    System.out.println("var :" +termenal_expr.getVariable_name());
                }
                else if(arithmetic_exprContext.IDENTIFIER() != null){
                    termenal_expr.setTermenal_node(arithmetic_exprContext.IDENTIFIER().getText());
                    System.out.println("IDENTIFIER :" +termenal_expr.getTermenal_node());
                }
                else if(arithmetic_exprContext.call_function() != null){
                    termenal_expr.setTermenal_node(arithmetic_exprContext.call_function().getText());
                    System.out.println("Call Function :" +termenal_expr.getTermenal_node());
                }
                else if(arithmetic_exprContext.ONE_CHAR_LETTER() != null){
                    termenal_expr.setTermenal_node(arithmetic_exprContext.ONE_CHAR_LETTER().getText());
                    System.out.println("ONE_CHAR_LETTER" +termenal_expr.getTermenal_node());
                }
                else if(arithmetic_exprContext.varible_from_object() != null){
                    termenal_expr.setTermenal_node(arithmetic_exprContext.varible_from_object().getText());
                    System.out.println("varible_from_object" +termenal_expr.getTermenal_node());
                }
                else if(arithmetic_exprContext.array_base_form_with_index() != null){
                    termenal_expr.setTermenal_node(arithmetic_exprContext.array_base_form_with_index().getText());
                    System.out.println("array_base_form_with_index" +termenal_expr.getTermenal_node());
                }



                else if(arithmetic_exprContext.PLUS() != null ) {
                    termenal_expr.setTermenal_node(arithmetic_exprContext.PLUS().toString());
                    System.out.println("opretor :"+termenal_expr.getTermenal_node());
                }
                else if (arithmetic_exprContext.MINUS() != null)
                {
                    termenal_expr.setTermenal_node(arithmetic_exprContext.MINUS().toString());
                    System.out.println("opretor :"+termenal_expr.getTermenal_node());
                }
                else if (arithmetic_exprContext.STAR() != null)
                {
                    termenal_expr.setTermenal_node(arithmetic_exprContext.STAR().toString());
                    System.out.println("opretor :"+termenal_expr.getTermenal_node());

                }
                else if (arithmetic_exprContext.DIV() != null)
                {
                    termenal_expr.setTermenal_node(arithmetic_exprContext.DIV().toString());
                    System.out.println("opretor :"+termenal_expr.getTermenal_node());

                }
                else if (arithmetic_exprContext.POWER() != null)
                {
                    termenal_expr.setTermenal_node(arithmetic_exprContext.POWER().toString());
                    System.out.println("opretor :"+termenal_expr.getTermenal_node());

                }
                else if (arithmetic_exprContext.MOD() != null)
                {
                    termenal_expr.setTermenal_node(arithmetic_exprContext.MOD().toString());
                    System.out.println("opretor :"+termenal_expr.getTermenal_node());

                }
                arithmatic_expr.getArithmatic_exprs_list().add(termenal_expr);

       }



        return arithmatic_expr;
    }

    @Override
    public full_arthmatic_statmint visitFull_arthmatic_statmint(SQLParser.Full_arthmatic_statmintContext ctx) {

        System.out.println("visit Full arthmatic statmint ");
        full_arthmatic_statmint full_arthmatic_statmint = new full_arthmatic_statmint();

        for (int i = 0; i < ctx.use_random_name().size() ; i++) {
        if(ctx.use_random_name() != null){
             full_arthmatic_statmint.getUse_random_name().add(visitUse_random_name(ctx.use_random_name().get(i)));
             System.out.println("var :" + full_arthmatic_statmint.getUse_random_name().get(i));
            }
        }
        for (int i = 0; i < ctx.array_base_form_with_index().size() ; i++) {
            if (ctx.array_base_form_with_index() != null) {
                full_arthmatic_statmint.getArray_base_form_with_index().add(visitArray_base_form_with_index(ctx.array_base_form_with_index(i)));
                System.out.println(full_arthmatic_statmint.getArray_base_form_with_index().get(i));
            }
        }
        for (int i = 0; i < ctx.varible_from_object().size() ; i++) {
            if (ctx.varible_from_object() != null) {
                full_arthmatic_statmint.getVarible_from_object().add(visitVarible_from_object(ctx.varible_from_object(i)));
                System.out.println(full_arthmatic_statmint.getVarible_from_object().get(i));
            }
        }
        for (int i = 0; i < ctx.any_arithmetic_oprator().size() ; i++) {
            if (ctx.varible_from_object() != null) {
                full_arthmatic_statmint.getAny_arithmetic_oprator().add(ctx.any_arithmetic_oprator(i).getText());
                System.out.println("oprator :"+full_arthmatic_statmint.getAny_arithmetic_oprator().get(i));
            }
        }
        full_arthmatic_statmint.setArithmatic_expr(visitArithmetic_expr(ctx.arithmetic_expr()));

        return full_arthmatic_statmint;
    }

    @Override
    public arithmetic_infunction_statment visitArithmetic_infunction_statment(SQLParser.Arithmetic_infunction_statmentContext ctx) {
        System.out.println("visit Arithmetic infunction statment");
        arithmetic_infunction_statment arithmetic_infunction_statment = new arithmetic_infunction_statment();
        if(ctx.full_arthmatic_statmint() != null) {
            arithmetic_infunction_statment.setFull_arthmatic_statmint(visitFull_arthmatic_statmint(ctx.full_arthmatic_statmint()));
        }
        else if(ctx.shortcut_statments() != null) {
            arithmetic_infunction_statment.setShortcut_instruction(ctx.shortcut_statments().getText());
            System.out.println(arithmetic_infunction_statment.getShortcut_instruction());
        }

        return arithmetic_infunction_statment;
    }

    @Override
    public Boolean_Expr  visitBoolean_expr(SQLParser.Boolean_exprContext ctx) {
        System.out.println("visit Boolean EXPR");
        Boolean_Expr boolean_expr = new Boolean_Expr();
        DFS_boolean_expr(ctx  );
        boolean_expr =  booleans( boolean_expr );

        return boolean_expr;

    }

    private void DFS_boolean_expr (SQLParser.Boolean_exprContext ctx )
    {
        int level = 1 ;
        HashSet<SQLParser.Arithmetic_exprContext> visited = new HashSet<SQLParser.Arithmetic_exprContext>();
        while(fill_boolean_expr_tree(ctx , level , visited)){
            //System.out.println("enter t");
            level++;
        }
    }

    private boolean fill_boolean_expr_tree(SQLParser.Boolean_exprContext ctx , int level ,HashSet visited ){
        if(ctx == null) {
            return false;
        }
        if(level == 1)
        {
            boolean_expr_tree.add(ctx);
            return true;
        }

        boolean left = fill_boolean_expr_tree(ctx.boolean_expr(0), level - 1 ,visited);
        boolean right = fill_boolean_expr_tree(ctx.boolean_expr(1), level - 1 , visited);
        return left || right;
    }

    private Boolean_Expr booleans( Boolean_Expr boolean_expr){
        while (!boolean_expr_tree.isEmpty())
        {
            SQLParser.Boolean_exprContext boolean_exprContext = boolean_expr_tree.pop();
            Boolean_Expr termenal_expr = new Boolean_Expr();
            if(boolean_exprContext.NUMERIC_LITERAL() != null){
                termenal_expr.setTermenal_node(boolean_exprContext.NUMERIC_LITERAL().toString());
                System.out.println("number :" +termenal_expr.getTermenal_node());
            }
            else if(boolean_exprContext.use_random_name() != null){
                termenal_expr.setVariable_name(visitUse_random_name(boolean_exprContext.use_random_name()));
                System.out.println("var :" +termenal_expr.getVariable_name());
            }
            else if(boolean_exprContext.IDENTIFIER() != null){
                termenal_expr.setTermenal_node(boolean_exprContext.IDENTIFIER().getText());
                System.out.println("IDENTIFIER :" +termenal_expr.getTermenal_node());
            }
            else if(boolean_exprContext.ONE_CHAR_LETTER() != null){
                termenal_expr.setTermenal_node(boolean_exprContext.ONE_CHAR_LETTER().getText());
                System.out.println("ONE_CHAR_LETTER" +termenal_expr.getTermenal_node());
            }
            else if(boolean_exprContext.varible_from_object() != null){
                termenal_expr.getVariablefromobjects().add(visitVarible_from_object(boolean_exprContext.varible_from_object()));
                System.out.println("varible_from_object" +termenal_expr.getVariablefromobjects());
            }
            else if(boolean_exprContext.array_base_form_with_index() != null){
                termenal_expr.getArray_base_fom_with_indices().add(visitArray_base_form_with_index(boolean_exprContext.array_base_form_with_index()));
                System.out.println("array_base_form_with_index" +termenal_expr.getArray_base_fom_with_indices());
            }
            else if (boolean_exprContext.arithmetic_expr() != null)
            {
                termenal_expr.setArithmatic_expr(visitArithmetic_expr(boolean_exprContext.arithmetic_expr()));
            }


            else if(boolean_exprContext.EQ() != null ) {
                termenal_expr.setTermenal_node(boolean_exprContext.EQ().toString());
                System.out.println("opretor :"+termenal_expr.getTermenal_node());
            }
            else if (boolean_exprContext.NOT_EQ1() != null)
            {
                termenal_expr.setTermenal_node(boolean_exprContext.NOT_EQ1().toString());
                System.out.println("opretor :"+termenal_expr.getTermenal_node());

            }
            else if (boolean_exprContext.GT_EQ() != null)
            {
                termenal_expr.setTermenal_node(boolean_exprContext.GT_EQ().toString());
                System.out.println("opretor :"+termenal_expr.getTermenal_node());
            }
            else if (boolean_exprContext.LT_EQ() != null)
            {
                termenal_expr.setTermenal_node(boolean_exprContext.LT_EQ().toString());
                System.out.println("opretor :"+termenal_expr.getTermenal_node());

            }
            else if (boolean_exprContext.GT() != null)
            {
                termenal_expr.setTermenal_node(boolean_exprContext.GT().toString());
                System.out.println("opretor :"+termenal_expr.getTermenal_node());

            }
            else if (boolean_exprContext.LT() != null)
            {
                termenal_expr.setTermenal_node(boolean_exprContext.LT().toString());
                System.out.println("opretor :"+termenal_expr.getTermenal_node());

            }
            boolean_expr.getBoolean_exprs_list().add(termenal_expr);
        }
        return boolean_expr;
    }

    @Override
    public Boolean_Infunction_Statment visitBoolean_infunction_statment(SQLParser.Boolean_infunction_statmentContext ctx) {
        System.out.println("visit Boolean infunction statment");
        Boolean_Infunction_Statment boolean_infunction_statment = new Boolean_Infunction_Statment();

        if(ctx != null)
        {
            for (int i = 0; i <ctx.boolean_expr().size() ; i++) {
                if(ctx.boolean_expr(i) != null)
                    boolean_infunction_statment.getBoolean_exprs().add(visitBoolean_expr(ctx.boolean_expr(i)));
            }
        }

        return boolean_infunction_statment;
    }

    @Override
    public instructions visitSwitch_rule(SQLParser.Switch_ruleContext ctx) {
        System.out.println("visit Switch");

        Switch ins = new Switch();
        ins.setInstrucation_name(Switch.class.getName());
        if(ctx.use_random_name() != null)
        {
            ins.setVariable_name(visitUse_random_name(ctx.use_random_name()));
        }
        else if (ctx.ONE_CHAR_LETTER() != null)
        {
            ins.setTermenal_node(ctx.ONE_CHAR_LETTER().getSymbol().getText());
        }
        else if (ctx.NUMERIC_LITERAL() != null)
        {
            ins.setTermenal_node(ctx.NUMERIC_LITERAL().getSymbol().getText());
        }
        else if (ctx.call_function() != null)
        {
            ins.setTermenal_node(ctx.call_function().getText());
        }
        else if (ctx.varible_from_object() != null)
        {
            ins.setTermenal_node(ctx.varible_from_object().getText());
        }
        else if (ctx.arithmetic_expr() != null)
        {
            ins.setArithmatic_expr(visitArithmetic_expr(ctx.arithmetic_expr()));
        }
        else if (ctx.arithmetic_infunction_statment() != null)
        {
            ins.setArithmetic_infunction_statment(visitArithmetic_infunction_statment(ctx.arithmetic_infunction_statment()));
        }

        if(ctx.case_rule() != null)
        for (int i = 0; i < ctx.case_rule().size(); i++) {
            ins.getCases().add(visitCase_rule(ctx.case_rule(i)));
        }
        if(ctx.defult() != null)
        {
            ins.setDeafult(visitDefult(ctx.defult()));
        }
        return ins;
    }

    @Override
    public Case visitCase_rule(SQLParser.Case_ruleContext ctx) {
        System.out.println("visit Case");
        Case case_ins = new Case();

        if(ctx.any_name() != null){
            case_ins.setVariable_name(ctx.any_name().getText());
        }
        else if(ctx.NUMERIC_LITERAL() != null)
        {
            case_ins.setTermenal_node(ctx.NUMERIC_LITERAL().getText());
        }
        else if(ctx.ONE_CHAR_LETTER() != null)
        {
            case_ins.setTermenal_node(ctx.ONE_CHAR_LETTER().getText());
        }
        else if(ctx.varible_from_object() != null)
        {
            case_ins.setTermenal_node(ctx.varible_from_object().getText());
        }

        for (int i = 0; i < ctx.instructions().size(); i++) {
            case_ins.getInstructions().add(visitInstructions(ctx.instructions(i)));
        }
        return case_ins;
    }

    @Override
    public Deafult visitDefult(SQLParser.DefultContext ctx) {
        System.out.println("visit Deafult");
        Deafult deafult = new Deafult();
        if(ctx.instructions() != null)
        {
            for (int i = 0; i < ctx.instructions().size(); i++) {
                deafult.getInstructions().add(visitInstructions(ctx.instructions(i)));
            }
        }
        return deafult;
    }
}

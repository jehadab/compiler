// Generated from C:/Users/Jehad/IdeaProjects/compilerv0.2/Sql_compiler-master/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#renametable}.
	 * @param ctx the parse tree
	 */
	void enterRenametable(SQLParser.RenametableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#renametable}.
	 * @param ctx the parse tree
	 */
	void exitRenametable(SQLParser.RenametableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#addcolumn}.
	 * @param ctx the parse tree
	 */
	void enterAddcolumn(SQLParser.AddcolumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#addcolumn}.
	 * @param ctx the parse tree
	 */
	void exitAddcolumn(SQLParser.AddcolumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#limit_expr}.
	 * @param ctx the parse tree
	 */
	void enterLimit_expr(SQLParser.Limit_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#limit_expr}.
	 * @param ctx the parse tree
	 */
	void exitLimit_expr(SQLParser.Limit_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#where_expr}.
	 * @param ctx the parse tree
	 */
	void enterWhere_expr(SQLParser.Where_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#where_expr}.
	 * @param ctx the parse tree
	 */
	void exitWhere_expr(SQLParser.Where_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#asign_expr_to_column}.
	 * @param ctx the parse tree
	 */
	void enterAsign_expr_to_column(SQLParser.Asign_expr_to_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#asign_expr_to_column}.
	 * @param ctx the parse tree
	 */
	void exitAsign_expr_to_column(SQLParser.Asign_expr_to_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number1}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number1(SQLParser.Signed_number1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number1}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number1(SQLParser.Signed_number1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number2}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number2(SQLParser.Signed_number2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number2}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number2(SQLParser.Signed_number2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_check}.
	 * @param ctx the parse tree
	 */
	void enterColumn_check(SQLParser.Column_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_check}.
	 * @param ctx the parse tree
	 */
	void exitColumn_check(SQLParser.Column_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_unique}.
	 * @param ctx the parse tree
	 */
	void enterColumn_unique(SQLParser.Column_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_unique}.
	 * @param ctx the parse tree
	 */
	void exitColumn_unique(SQLParser.Column_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#commn_expr_opreator}.
	 * @param ctx the parse tree
	 */
	void enterCommn_expr_opreator(SQLParser.Commn_expr_opreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#commn_expr_opreator}.
	 * @param ctx the parse tree
	 */
	void exitCommn_expr_opreator(SQLParser.Commn_expr_opreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_check}.
	 * @param ctx the parse tree
	 */
	void enterTable_check(SQLParser.Table_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_check}.
	 * @param ctx the parse tree
	 */
	void exitTable_check(SQLParser.Table_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#list_of_expr}.
	 * @param ctx the parse tree
	 */
	void enterList_of_expr(SQLParser.List_of_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#list_of_expr}.
	 * @param ctx the parse tree
	 */
	void exitList_of_expr(SQLParser.List_of_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#list_of_list_of_expr}.
	 * @param ctx the parse tree
	 */
	void enterList_of_list_of_expr(SQLParser.List_of_list_of_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#list_of_list_of_expr}.
	 * @param ctx the parse tree
	 */
	void exitList_of_list_of_expr(SQLParser.List_of_list_of_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#having_expr}.
	 * @param ctx the parse tree
	 */
	void enterHaving_expr(SQLParser.Having_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#having_expr}.
	 * @param ctx the parse tree
	 */
	void exitHaving_expr(SQLParser.Having_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#funtion}.
	 * @param ctx the parse tree
	 */
	void enterFuntion(SQLParser.FuntionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#funtion}.
	 * @param ctx the parse tree
	 */
	void exitFuntion(SQLParser.FuntionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_header}.
	 * @param ctx the parse tree
	 */
	void enterFunction_header(SQLParser.Function_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_header}.
	 * @param ctx the parse tree
	 */
	void exitFunction_header(SQLParser.Function_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(SQLParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(SQLParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sub_function_body}.
	 * @param ctx the parse tree
	 */
	void enterSub_function_body(SQLParser.Sub_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sub_function_body}.
	 * @param ctx the parse tree
	 */
	void exitSub_function_body(SQLParser.Sub_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(SQLParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(SQLParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functional_instruction}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_instruction(SQLParser.Functional_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functional_instruction}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_instruction(SQLParser.Functional_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#nonfunctional_instruction}.
	 * @param ctx the parse tree
	 */
	void enterNonfunctional_instruction(SQLParser.Nonfunctional_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#nonfunctional_instruction}.
	 * @param ctx the parse tree
	 */
	void exitNonfunctional_instruction(SQLParser.Nonfunctional_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(SQLParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(SQLParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#callback_func}.
	 * @param ctx the parse tree
	 */
	void enterCallback_func(SQLParser.Callback_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#callback_func}.
	 * @param ctx the parse tree
	 */
	void exitCallback_func(SQLParser.Callback_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(SQLParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(SQLParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#prameters}.
	 * @param ctx the parse tree
	 */
	void enterPrameters(SQLParser.PrametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#prameters}.
	 * @param ctx the parse tree
	 */
	void exitPrameters(SQLParser.PrametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_rule}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rule(SQLParser.Return_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_rule}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rule(SQLParser.Return_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#exiting_loops}.
	 * @param ctx the parse tree
	 */
	void enterExiting_loops(SQLParser.Exiting_loopsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#exiting_loops}.
	 * @param ctx the parse tree
	 */
	void exitExiting_loops(SQLParser.Exiting_loopsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_type(SQLParser.Return_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_type(SQLParser.Return_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statment(SQLParser.Print_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#print_statment}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statment(SQLParser.Print_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indisde_the_print}.
	 * @param ctx the parse tree
	 */
	void enterIndisde_the_print(SQLParser.Indisde_the_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indisde_the_print}.
	 * @param ctx the parse tree
	 */
	void exitIndisde_the_print(SQLParser.Indisde_the_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_else_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_rule(SQLParser.If_else_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_else_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_rule(SQLParser.If_else_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void enterIf_rule(SQLParser.If_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#if_rule}.
	 * @param ctx the parse tree
	 */
	void exitIf_rule(SQLParser.If_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else_if_rule}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_rule(SQLParser.Else_if_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else_if_rule}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_rule(SQLParser.Else_if_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else_rulse}.
	 * @param ctx the parse tree
	 */
	void enterElse_rulse(SQLParser.Else_rulseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else_rulse}.
	 * @param ctx the parse tree
	 */
	void exitElse_rulse(SQLParser.Else_rulseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void enterWhile_rule(SQLParser.While_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#while_rule}.
	 * @param ctx the parse tree
	 */
	void exitWhile_rule(SQLParser.While_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 */
	void enterDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 */
	void exitDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#for_loop_rule}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_rule(SQLParser.For_loop_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#for_loop_rule}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_rule(SQLParser.For_loop_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#inside_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterInside_for_loop(SQLParser.Inside_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#inside_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitInside_for_loop(SQLParser.Inside_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(SQLParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(SQLParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#one_line_if_instruction}.
	 * @param ctx the parse tree
	 */
	void enterOne_line_if_instruction(SQLParser.One_line_if_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#one_line_if_instruction}.
	 * @param ctx the parse tree
	 */
	void exitOne_line_if_instruction(SQLParser.One_line_if_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#one_line_if_statment_rule}.
	 * @param ctx the parse tree
	 */
	void enterOne_line_if_statment_rule(SQLParser.One_line_if_statment_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#one_line_if_statment_rule}.
	 * @param ctx the parse tree
	 */
	void exitOne_line_if_statment_rule(SQLParser.One_line_if_statment_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#inside_one_line_function}.
	 * @param ctx the parse tree
	 */
	void enterInside_one_line_function(SQLParser.Inside_one_line_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#inside_one_line_function}.
	 * @param ctx the parse tree
	 */
	void exitInside_one_line_function(SQLParser.Inside_one_line_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#switch_rule}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_rule(SQLParser.Switch_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#switch_rule}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_rule(SQLParser.Switch_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#defult}.
	 * @param ctx the parse tree
	 */
	void enterDefult(SQLParser.DefultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#defult}.
	 * @param ctx the parse tree
	 */
	void exitDefult(SQLParser.DefultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#case_rule}.
	 * @param ctx the parse tree
	 */
	void enterCase_rule(SQLParser.Case_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#case_rule}.
	 * @param ctx the parse tree
	 */
	void exitCase_rule(SQLParser.Case_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#creating_with_assign}.
	 * @param ctx the parse tree
	 */
	void enterCreating_with_assign(SQLParser.Creating_with_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#creating_with_assign}.
	 * @param ctx the parse tree
	 */
	void exitCreating_with_assign(SQLParser.Creating_with_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#grnral_creating}.
	 * @param ctx the parse tree
	 */
	void enterGrnral_creating(SQLParser.Grnral_creatingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#grnral_creating}.
	 * @param ctx the parse tree
	 */
	void exitGrnral_creating(SQLParser.Grnral_creatingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#creat_without_assign}.
	 * @param ctx the parse tree
	 */
	void enterCreat_without_assign(SQLParser.Creat_without_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#creat_without_assign}.
	 * @param ctx the parse tree
	 */
	void exitCreat_without_assign(SQLParser.Creat_without_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#genral_assign}.
	 * @param ctx the parse tree
	 */
	void enterGenral_assign(SQLParser.Genral_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#genral_assign}.
	 * @param ctx the parse tree
	 */
	void exitGenral_assign(SQLParser.Genral_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#varible_name}.
	 * @param ctx the parse tree
	 */
	void enterVarible_name(SQLParser.Varible_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#varible_name}.
	 * @param ctx the parse tree
	 */
	void exitVarible_name(SQLParser.Varible_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assign_varible}.
	 * @param ctx the parse tree
	 */
	void enterAssign_varible(SQLParser.Assign_varibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assign_varible}.
	 * @param ctx the parse tree
	 */
	void exitAssign_varible(SQLParser.Assign_varibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_varible_form}.
	 * @param ctx the parse tree
	 */
	void enterCreate_varible_form(SQLParser.Create_varible_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_varible_form}.
	 * @param ctx the parse tree
	 */
	void exitCreate_varible_form(SQLParser.Create_varible_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_varible_without_assign}.
	 * @param ctx the parse tree
	 */
	void enterCreate_varible_without_assign(SQLParser.Create_varible_without_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_varible_without_assign}.
	 * @param ctx the parse tree
	 */
	void exitCreate_varible_without_assign(SQLParser.Create_varible_without_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_varible_with_assign}.
	 * @param ctx the parse tree
	 */
	void enterCreate_varible_with_assign(SQLParser.Create_varible_with_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_varible_with_assign}.
	 * @param ctx the parse tree
	 */
	void exitCreate_varible_with_assign(SQLParser.Create_varible_with_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_name}.
	 * @param ctx the parse tree
	 */
	void enterArray_name(SQLParser.Array_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_name}.
	 * @param ctx the parse tree
	 */
	void exitArray_name(SQLParser.Array_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assign_array}.
	 * @param ctx the parse tree
	 */
	void enterAssign_array(SQLParser.Assign_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assign_array}.
	 * @param ctx the parse tree
	 */
	void exitAssign_array(SQLParser.Assign_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_array_form}.
	 * @param ctx the parse tree
	 */
	void enterCreate_array_form(SQLParser.Create_array_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_array_form}.
	 * @param ctx the parse tree
	 */
	void exitCreate_array_form(SQLParser.Create_array_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_Array_without_assign}.
	 * @param ctx the parse tree
	 */
	void enterCreate_Array_without_assign(SQLParser.Create_Array_without_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_Array_without_assign}.
	 * @param ctx the parse tree
	 */
	void exitCreate_Array_without_assign(SQLParser.Create_Array_without_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_Array_with_assign}.
	 * @param ctx the parse tree
	 */
	void enterCreate_Array_with_assign(SQLParser.Create_Array_with_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_Array_with_assign}.
	 * @param ctx the parse tree
	 */
	void exitCreate_Array_with_assign(SQLParser.Create_Array_with_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_base_form_without_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_base_form_without_index(SQLParser.Array_base_form_without_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_base_form_without_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_base_form_without_index(SQLParser.Array_base_form_without_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_base_form_with_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_base_form_with_index(SQLParser.Array_base_form_with_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_base_form_with_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_base_form_with_index(SQLParser.Array_base_form_with_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_identifier_form}.
	 * @param ctx the parse tree
	 */
	void enterArray_identifier_form(SQLParser.Array_identifier_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_identifier_form}.
	 * @param ctx the parse tree
	 */
	void exitArray_identifier_form(SQLParser.Array_identifier_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_boolean_form}.
	 * @param ctx the parse tree
	 */
	void enterArray_boolean_form(SQLParser.Array_boolean_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_boolean_form}.
	 * @param ctx the parse tree
	 */
	void exitArray_boolean_form(SQLParser.Array_boolean_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_integer_form}.
	 * @param ctx the parse tree
	 */
	void enterArray_integer_form(SQLParser.Array_integer_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_integer_form}.
	 * @param ctx the parse tree
	 */
	void exitArray_integer_form(SQLParser.Array_integer_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_charecter_form}.
	 * @param ctx the parse tree
	 */
	void enterArray_charecter_form(SQLParser.Array_charecter_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_charecter_form}.
	 * @param ctx the parse tree
	 */
	void exitArray_charecter_form(SQLParser.Array_charecter_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_objects_form}.
	 * @param ctx the parse tree
	 */
	void enterArray_objects_form(SQLParser.Array_objects_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_objects_form}.
	 * @param ctx the parse tree
	 */
	void exitArray_objects_form(SQLParser.Array_objects_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_objects_form2}.
	 * @param ctx the parse tree
	 */
	void enterArray_objects_form2(SQLParser.Array_objects_form2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_objects_form2}.
	 * @param ctx the parse tree
	 */
	void exitArray_objects_form2(SQLParser.Array_objects_form2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_varible_form}.
	 * @param ctx the parse tree
	 */
	void enterArray_varible_form(SQLParser.Array_varible_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_varible_form}.
	 * @param ctx the parse tree
	 */
	void exitArray_varible_form(SQLParser.Array_varible_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_anyType_form}.
	 * @param ctx the parse tree
	 */
	void enterArray_anyType_form(SQLParser.Array_anyType_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_anyType_form}.
	 * @param ctx the parse tree
	 */
	void exitArray_anyType_form(SQLParser.Array_anyType_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_arrayes_form}.
	 * @param ctx the parse tree
	 */
	void enterArray_arrayes_form(SQLParser.Array_arrayes_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_arrayes_form}.
	 * @param ctx the parse tree
	 */
	void exitArray_arrayes_form(SQLParser.Array_arrayes_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#value_left_side}.
	 * @param ctx the parse tree
	 */
	void enterValue_left_side(SQLParser.Value_left_sideContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#value_left_side}.
	 * @param ctx the parse tree
	 */
	void exitValue_left_side(SQLParser.Value_left_sideContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#left_side_array}.
	 * @param ctx the parse tree
	 */
	void enterLeft_side_array(SQLParser.Left_side_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#left_side_array}.
	 * @param ctx the parse tree
	 */
	void exitLeft_side_array(SQLParser.Left_side_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_name}.
	 * @param ctx the parse tree
	 */
	void enterJson_name(SQLParser.Json_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_name}.
	 * @param ctx the parse tree
	 */
	void exitJson_name(SQLParser.Json_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#assign_json}.
	 * @param ctx the parse tree
	 */
	void enterAssign_json(SQLParser.Assign_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#assign_json}.
	 * @param ctx the parse tree
	 */
	void exitAssign_json(SQLParser.Assign_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_json_form}.
	 * @param ctx the parse tree
	 */
	void enterCreate_json_form(SQLParser.Create_json_formContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_json_form}.
	 * @param ctx the parse tree
	 */
	void exitCreate_json_form(SQLParser.Create_json_formContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_json_object_without_assign}.
	 * @param ctx the parse tree
	 */
	void enterCreate_json_object_without_assign(SQLParser.Create_json_object_without_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_json_object_without_assign}.
	 * @param ctx the parse tree
	 */
	void exitCreate_json_object_without_assign(SQLParser.Create_json_object_without_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_json_with_assign}.
	 * @param ctx the parse tree
	 */
	void enterCreate_json_with_assign(SQLParser.Create_json_with_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_json_with_assign}.
	 * @param ctx the parse tree
	 */
	void exitCreate_json_with_assign(SQLParser.Create_json_with_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#inside_json_statmnet}.
	 * @param ctx the parse tree
	 */
	void enterInside_json_statmnet(SQLParser.Inside_json_statmnetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#inside_json_statmnet}.
	 * @param ctx the parse tree
	 */
	void exitInside_json_statmnet(SQLParser.Inside_json_statmnetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_statment}.
	 * @param ctx the parse tree
	 */
	void enterJson_statment(SQLParser.Json_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_statment}.
	 * @param ctx the parse tree
	 */
	void exitJson_statment(SQLParser.Json_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#value_json_statmnet}.
	 * @param ctx the parse tree
	 */
	void enterValue_json_statmnet(SQLParser.Value_json_statmnetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#value_json_statmnet}.
	 * @param ctx the parse tree
	 */
	void exitValue_json_statmnet(SQLParser.Value_json_statmnetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#varible_from_object}.
	 * @param ctx the parse tree
	 */
	void enterVarible_from_object(SQLParser.Varible_from_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#varible_from_object}.
	 * @param ctx the parse tree
	 */
	void exitVarible_from_object(SQLParser.Varible_from_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arithmetic_infunction_statment}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_infunction_statment(SQLParser.Arithmetic_infunction_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arithmetic_infunction_statment}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_infunction_statment(SQLParser.Arithmetic_infunction_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#full_arthmatic_statmint}.
	 * @param ctx the parse tree
	 */
	void enterFull_arthmatic_statmint(SQLParser.Full_arthmatic_statmintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#full_arthmatic_statmint}.
	 * @param ctx the parse tree
	 */
	void exitFull_arthmatic_statmint(SQLParser.Full_arthmatic_statmintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expr(SQLParser.Arithmetic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expr(SQLParser.Arithmetic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_arithmetic_oprator}.
	 * @param ctx the parse tree
	 */
	void enterAny_arithmetic_oprator(SQLParser.Any_arithmetic_opratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_arithmetic_oprator}.
	 * @param ctx the parse tree
	 */
	void exitAny_arithmetic_oprator(SQLParser.Any_arithmetic_opratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#boolean_infunction_statment}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_infunction_statment(SQLParser.Boolean_infunction_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#boolean_infunction_statment}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_infunction_statment(SQLParser.Boolean_infunction_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expr(SQLParser.Boolean_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#boolean_expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expr(SQLParser.Boolean_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#shortcut_statments}.
	 * @param ctx the parse tree
	 */
	void enterShortcut_statments(SQLParser.Shortcut_statmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#shortcut_statments}.
	 * @param ctx the parse tree
	 */
	void exitShortcut_statments(SQLParser.Shortcut_statmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#use_random_name}.
	 * @param ctx the parse tree
	 */
	void enterUse_random_name(SQLParser.Use_random_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#use_random_name}.
	 * @param ctx the parse tree
	 */
	void exitUse_random_name(SQLParser.Use_random_nameContext ctx);
}
// Generated from C:/Users/Jehad/IdeaProjects/compilerv0.2/Sql_compiler-master/src\SQL.g4 by ANTLR 4.7.2
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#renametable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenametable(SQLParser.RenametableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#addcolumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddcolumn(SQLParser.AddcolumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#limit_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_expr(SQLParser.Limit_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#where_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_expr(SQLParser.Where_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#asign_expr_to_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign_expr_to_column(SQLParser.Asign_expr_to_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number1(SQLParser.Signed_number1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number2(SQLParser.Signed_number2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_check(SQLParser.Column_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_unique(SQLParser.Column_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#commn_expr_opreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommn_expr_opreator(SQLParser.Commn_expr_opreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_check(SQLParser.Table_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#list_of_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_expr(SQLParser.List_of_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#list_of_list_of_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_list_of_expr(SQLParser.List_of_list_of_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#having_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_expr(SQLParser.Having_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#funtion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntion(SQLParser.FuntionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_header(SQLParser.Function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(SQLParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sub_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_function_body(SQLParser.Sub_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(SQLParser.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functional_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional_instruction(SQLParser.Functional_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#nonfunctional_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonfunctional_instruction(SQLParser.Nonfunctional_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(SQLParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#callback_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallback_func(SQLParser.Callback_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(SQLParser.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#prameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrameters(SQLParser.PrametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rule(SQLParser.Return_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#exiting_loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExiting_loops(SQLParser.Exiting_loopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(SQLParser.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#print_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statment(SQLParser.Print_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indisde_the_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndisde_the_print(SQLParser.Indisde_the_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_else_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_rule(SQLParser.If_else_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(SQLParser.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else_if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_rule(SQLParser.Else_if_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else_rulse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_rulse(SQLParser.Else_rulseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#while_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_rule(SQLParser.While_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(SQLParser.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#for_loop_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_rule(SQLParser.For_loop_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#inside_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside_for_loop(SQLParser.Inside_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(SQLParser.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#one_line_if_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_line_if_instruction(SQLParser.One_line_if_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#one_line_if_statment_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne_line_if_statment_rule(SQLParser.One_line_if_statment_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#inside_one_line_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside_one_line_function(SQLParser.Inside_one_line_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#switch_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_rule(SQLParser.Switch_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#defult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefult(SQLParser.DefultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#case_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_rule(SQLParser.Case_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#creating_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreating_with_assign(SQLParser.Creating_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#grnral_creating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrnral_creating(SQLParser.Grnral_creatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#creat_without_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreat_without_assign(SQLParser.Creat_without_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#genral_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenral_assign(SQLParser.Genral_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#varible_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarible_name(SQLParser.Varible_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assign_varible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_varible(SQLParser.Assign_varibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_varible_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_varible_form(SQLParser.Create_varible_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_varible_without_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_varible_without_assign(SQLParser.Create_varible_without_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_varible_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_varible_with_assign(SQLParser.Create_varible_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_name(SQLParser.Array_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assign_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_array(SQLParser.Assign_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_array_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_array_form(SQLParser.Create_array_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_Array_without_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_Array_without_assign(SQLParser.Create_Array_without_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_Array_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_Array_with_assign(SQLParser.Create_Array_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_base_form_without_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_base_form_without_index(SQLParser.Array_base_form_without_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_base_form_with_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_base_form_with_index(SQLParser.Array_base_form_with_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_identifier_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_identifier_form(SQLParser.Array_identifier_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_boolean_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_boolean_form(SQLParser.Array_boolean_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_integer_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_integer_form(SQLParser.Array_integer_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_charecter_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_charecter_form(SQLParser.Array_charecter_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_objects_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_objects_form(SQLParser.Array_objects_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_objects_form2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_objects_form2(SQLParser.Array_objects_form2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_varible_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_varible_form(SQLParser.Array_varible_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_anyType_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_anyType_form(SQLParser.Array_anyType_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_arrayes_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_arrayes_form(SQLParser.Array_arrayes_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#value_left_side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_left_side(SQLParser.Value_left_sideContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#left_side_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_side_array(SQLParser.Left_side_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_name(SQLParser.Json_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#assign_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_json(SQLParser.Assign_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_json_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_json_form(SQLParser.Create_json_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_json_object_without_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_json_object_without_assign(SQLParser.Create_json_object_without_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_json_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_json_with_assign(SQLParser.Create_json_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#inside_json_statmnet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside_json_statmnet(SQLParser.Inside_json_statmnetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_statment(SQLParser.Json_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#value_json_statmnet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_json_statmnet(SQLParser.Value_json_statmnetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#varible_from_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarible_from_object(SQLParser.Varible_from_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arithmetic_infunction_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_infunction_statment(SQLParser.Arithmetic_infunction_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#full_arthmatic_statmint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_arthmatic_statmint(SQLParser.Full_arthmatic_statmintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arithmetic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic_expr(SQLParser.Arithmetic_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_arithmetic_oprator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_arithmetic_oprator(SQLParser.Any_arithmetic_opratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_infunction_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_infunction_statment(SQLParser.Boolean_infunction_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#boolean_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expr(SQLParser.Boolean_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#shortcut_statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortcut_statments(SQLParser.Shortcut_statmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#use_random_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_random_name(SQLParser.Use_random_nameContext ctx);
}
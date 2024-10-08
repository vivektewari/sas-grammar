// Generated from /home/pooja/PycharmProjects/sas-grammar/DataStep.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DataStepParser}.
 */
public interface DataStepListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DataStepParser#data_step_block}.
	 * @param ctx the parse tree
	 */
	void enterData_step_block(DataStepParser.Data_step_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#data_step_block}.
	 * @param ctx the parse tree
	 */
	void exitData_step_block(DataStepParser.Data_step_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#data_step_statement}.
	 * @param ctx the parse tree
	 */
	void enterData_step_statement(DataStepParser.Data_step_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#data_step_statement}.
	 * @param ctx the parse tree
	 */
	void exitData_step_statement(DataStepParser.Data_step_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DataStepParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DataStepParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DataStepParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DataStepParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(DataStepParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(DataStepParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(DataStepParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(DataStepParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(DataStepParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(DataStepParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(DataStepParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(DataStepParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DataStepParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DataStepParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(DataStepParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(DataStepParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#data_stmt}.
	 * @param ctx the parse tree
	 */
	void enterData_stmt(DataStepParser.Data_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#data_stmt}.
	 * @param ctx the parse tree
	 */
	void exitData_stmt(DataStepParser.Data_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#dataset_name_opt}.
	 * @param ctx the parse tree
	 */
	void enterDataset_name_opt(DataStepParser.Dataset_name_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#dataset_name_opt}.
	 * @param ctx the parse tree
	 */
	void exitDataset_name_opt(DataStepParser.Dataset_name_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#datastmt_cmd}.
	 * @param ctx the parse tree
	 */
	void enterDatastmt_cmd(DataStepParser.Datastmt_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#datastmt_cmd}.
	 * @param ctx the parse tree
	 */
	void exitDatastmt_cmd(DataStepParser.Datastmt_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#view_dsname_opt}.
	 * @param ctx the parse tree
	 */
	void enterView_dsname_opt(DataStepParser.View_dsname_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#view_dsname_opt}.
	 * @param ctx the parse tree
	 */
	void exitView_dsname_opt(DataStepParser.View_dsname_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(DataStepParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(DataStepParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#dataset_name}.
	 * @param ctx the parse tree
	 */
	void enterDataset_name(DataStepParser.Dataset_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#dataset_name}.
	 * @param ctx the parse tree
	 */
	void exitDataset_name(DataStepParser.Dataset_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#program_name}.
	 * @param ctx the parse tree
	 */
	void enterProgram_name(DataStepParser.Program_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#program_name}.
	 * @param ctx the parse tree
	 */
	void exitProgram_name(DataStepParser.Program_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#passwd_opt}.
	 * @param ctx the parse tree
	 */
	void enterPasswd_opt(DataStepParser.Passwd_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#passwd_opt}.
	 * @param ctx the parse tree
	 */
	void exitPasswd_opt(DataStepParser.Passwd_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#source_opt}.
	 * @param ctx the parse tree
	 */
	void enterSource_opt(DataStepParser.Source_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#source_opt}.
	 * @param ctx the parse tree
	 */
	void exitSource_opt(DataStepParser.Source_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_stmt(DataStepParser.Set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_stmt(DataStepParser.Set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(DataStepParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(DataStepParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(DataStepParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(DataStepParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(DataStepParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(DataStepParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DataStepParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DataStepParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(DataStepParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(DataStepParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(DataStepParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(DataStepParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DataStepParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DataStepParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DataStepParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DataStepParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#input_main}.
	 * @param ctx the parse tree
	 */
	void enterInput_main(DataStepParser.Input_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#input_main}.
	 * @param ctx the parse tree
	 */
	void exitInput_main(DataStepParser.Input_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(DataStepParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(DataStepParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPut_stmt(DataStepParser.Put_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPut_stmt(DataStepParser.Put_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void enterInput_specification(DataStepParser.Input_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void exitInput_specification(DataStepParser.Input_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void enterPut_specification(DataStepParser.Put_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void exitPut_specification(DataStepParser.Put_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void enterPointer_control(DataStepParser.Pointer_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void exitPointer_control(DataStepParser.Pointer_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void enterInformat_list(DataStepParser.Informat_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void exitInformat_list(DataStepParser.Informat_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable_format(DataStepParser.Input_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable_format(DataStepParser.Input_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable(DataStepParser.Input_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable(DataStepParser.Input_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable_format(DataStepParser.Put_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable_format(DataStepParser.Put_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable(DataStepParser.Put_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable(DataStepParser.Put_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void enterColumn_point_control(DataStepParser.Column_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void exitColumn_point_control(DataStepParser.Column_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void enterLine_point_control(DataStepParser.Line_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void exitLine_point_control(DataStepParser.Line_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFormat_modifier(DataStepParser.Format_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFormat_modifier(DataStepParser.Format_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void enterColumn_specifications(DataStepParser.Column_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void exitColumn_specifications(DataStepParser.Column_specificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DataStepParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DataStepParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#sas_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSas_stmt_list(DataStepParser.Sas_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#sas_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSas_stmt_list(DataStepParser.Sas_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(DataStepParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(DataStepParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#if_then_else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_then_else_stmt(DataStepParser.If_then_else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#if_then_else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_then_else_stmt(DataStepParser.If_then_else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(DataStepParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(DataStepParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#abort_main}.
	 * @param ctx the parse tree
	 */
	void enterAbort_main(DataStepParser.Abort_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#abort_main}.
	 * @param ctx the parse tree
	 */
	void exitAbort_main(DataStepParser.Abort_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAbort_stmt(DataStepParser.Abort_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAbort_stmt(DataStepParser.Abort_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(DataStepParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(DataStepParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#proc_stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_stmt_block(DataStepParser.Proc_stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#proc_stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_stmt_block(DataStepParser.Proc_stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#proc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProc_stmt(DataStepParser.Proc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#proc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProc_stmt(DataStepParser.Proc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#proc_name}.
	 * @param ctx the parse tree
	 */
	void enterProc_name(DataStepParser.Proc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#proc_name}.
	 * @param ctx the parse tree
	 */
	void exitProc_name(DataStepParser.Proc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#array_main}.
	 * @param ctx the parse tree
	 */
	void enterArray_main(DataStepParser.Array_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#array_main}.
	 * @param ctx the parse tree
	 */
	void exitArray_main(DataStepParser.Array_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#array_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArray_stmt(DataStepParser.Array_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#array_stmt}.
	 * @param ctx the parse tree
	 */
	void exitArray_stmt(DataStepParser.Array_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#array_name}.
	 * @param ctx the parse tree
	 */
	void enterArray_name(DataStepParser.Array_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#array_name}.
	 * @param ctx the parse tree
	 */
	void exitArray_name(DataStepParser.Array_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#array_subscript}.
	 * @param ctx the parse tree
	 */
	void enterArray_subscript(DataStepParser.Array_subscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#array_subscript}.
	 * @param ctx the parse tree
	 */
	void exitArray_subscript(DataStepParser.Array_subscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements(DataStepParser.Array_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements(DataStepParser.Array_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#initial_value_list}.
	 * @param ctx the parse tree
	 */
	void enterInitial_value_list(DataStepParser.Initial_value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#initial_value_list}.
	 * @param ctx the parse tree
	 */
	void exitInitial_value_list(DataStepParser.Initial_value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#initial_value_list_item}.
	 * @param ctx the parse tree
	 */
	void enterInitial_value_list_item(DataStepParser.Initial_value_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#initial_value_list_item}.
	 * @param ctx the parse tree
	 */
	void exitInitial_value_list_item(DataStepParser.Initial_value_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#initial_value_list_bk}.
	 * @param ctx the parse tree
	 */
	void enterInitial_value_list_bk(DataStepParser.Initial_value_list_bkContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#initial_value_list_bk}.
	 * @param ctx the parse tree
	 */
	void exitInitial_value_list_bk(DataStepParser.Initial_value_list_bkContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#constant_iter_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_iter_value(DataStepParser.Constant_iter_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#constant_iter_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_iter_value(DataStepParser.Constant_iter_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void enterConstant_value(DataStepParser.Constant_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#constant_value}.
	 * @param ctx the parse tree
	 */
	void exitConstant_value(DataStepParser.Constant_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#by_main}.
	 * @param ctx the parse tree
	 */
	void enterBy_main(DataStepParser.By_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#by_main}.
	 * @param ctx the parse tree
	 */
	void exitBy_main(DataStepParser.By_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#by_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBy_stmt(DataStepParser.By_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#by_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBy_stmt(DataStepParser.By_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#call_main}.
	 * @param ctx the parse tree
	 */
	void enterCall_main(DataStepParser.Call_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#call_main}.
	 * @param ctx the parse tree
	 */
	void exitCall_main(DataStepParser.Call_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(DataStepParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(DataStepParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#datalines_main}.
	 * @param ctx the parse tree
	 */
	void enterDatalines_main(DataStepParser.Datalines_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#datalines_main}.
	 * @param ctx the parse tree
	 */
	void exitDatalines_main(DataStepParser.Datalines_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#datalines_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDatalines_stmt(DataStepParser.Datalines_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#datalines_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDatalines_stmt(DataStepParser.Datalines_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#datalines4_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDatalines4_stmt(DataStepParser.Datalines4_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#datalines4_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDatalines4_stmt(DataStepParser.Datalines4_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#drop_main}.
	 * @param ctx the parse tree
	 */
	void enterDrop_main(DataStepParser.Drop_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#drop_main}.
	 * @param ctx the parse tree
	 */
	void exitDrop_main(DataStepParser.Drop_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(DataStepParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(DataStepParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#infile_main}.
	 * @param ctx the parse tree
	 */
	void enterInfile_main(DataStepParser.Infile_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#infile_main}.
	 * @param ctx the parse tree
	 */
	void exitInfile_main(DataStepParser.Infile_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#infile_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInfile_stmt(DataStepParser.Infile_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#infile_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInfile_stmt(DataStepParser.Infile_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void enterFile_specification(DataStepParser.File_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#file_specification}.
	 * @param ctx the parse tree
	 */
	void exitFile_specification(DataStepParser.File_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#device_type}.
	 * @param ctx the parse tree
	 */
	void enterDevice_type(DataStepParser.Device_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#device_type}.
	 * @param ctx the parse tree
	 */
	void exitDevice_type(DataStepParser.Device_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#infile_options}.
	 * @param ctx the parse tree
	 */
	void enterInfile_options(DataStepParser.Infile_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#infile_options}.
	 * @param ctx the parse tree
	 */
	void exitInfile_options(DataStepParser.Infile_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#means_main}.
	 * @param ctx the parse tree
	 */
	void enterMeans_main(DataStepParser.Means_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#means_main}.
	 * @param ctx the parse tree
	 */
	void exitMeans_main(DataStepParser.Means_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#means_proc}.
	 * @param ctx the parse tree
	 */
	void enterMeans_proc(DataStepParser.Means_procContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#means_proc}.
	 * @param ctx the parse tree
	 */
	void exitMeans_proc(DataStepParser.Means_procContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#run_main}.
	 * @param ctx the parse tree
	 */
	void enterRun_main(DataStepParser.Run_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#run_main}.
	 * @param ctx the parse tree
	 */
	void exitRun_main(DataStepParser.Run_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#run_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRun_stmt(DataStepParser.Run_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#run_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRun_stmt(DataStepParser.Run_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#doLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoLoop(DataStepParser.DoLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#doLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoLoop(DataStepParser.DoLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#loopVariable}.
	 * @param ctx the parse tree
	 */
	void enterLoopVariable(DataStepParser.LoopVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#loopVariable}.
	 * @param ctx the parse tree
	 */
	void exitLoopVariable(DataStepParser.LoopVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#startValue}.
	 * @param ctx the parse tree
	 */
	void enterStartValue(DataStepParser.StartValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#startValue}.
	 * @param ctx the parse tree
	 */
	void exitStartValue(DataStepParser.StartValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#endValue}.
	 * @param ctx the parse tree
	 */
	void enterEndValue(DataStepParser.EndValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#endValue}.
	 * @param ctx the parse tree
	 */
	void exitEndValue(DataStepParser.EndValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#incrementValue}.
	 * @param ctx the parse tree
	 */
	void enterIncrementValue(DataStepParser.IncrementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#incrementValue}.
	 * @param ctx the parse tree
	 */
	void exitIncrementValue(DataStepParser.IncrementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void enterPutStatement(DataStepParser.PutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void exitPutStatement(DataStepParser.PutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DataStepParser#outputExpression}.
	 * @param ctx the parse tree
	 */
	void enterOutputExpression(DataStepParser.OutputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DataStepParser#outputExpression}.
	 * @param ctx the parse tree
	 */
	void exitOutputExpression(DataStepParser.OutputExpressionContext ctx);
}
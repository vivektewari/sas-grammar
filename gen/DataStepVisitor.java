// Generated from /home/pooja/PycharmProjects/sas-grammar/DataStep.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DataStepParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DataStepVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DataStepParser#data_step_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_step_block(DataStepParser.Data_step_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#data_step_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_step_statement(DataStepParser.Data_step_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DataStepParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DataStepParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(DataStepParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(DataStepParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(DataStepParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(DataStepParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DataStepParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(DataStepParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#data_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_stmt(DataStepParser.Data_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#dataset_name_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_name_opt(DataStepParser.Dataset_name_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#datastmt_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatastmt_cmd(DataStepParser.Datastmt_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#view_dsname_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_dsname_opt(DataStepParser.View_dsname_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(DataStepParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#dataset_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset_name(DataStepParser.Dataset_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#program_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_name(DataStepParser.Program_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#passwd_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswd_opt(DataStepParser.Passwd_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#source_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_opt(DataStepParser.Source_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#set_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_stmt(DataStepParser.Set_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(DataStepParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(DataStepParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(DataStepParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DataStepParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(DataStepParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(DataStepParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DataStepParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DataStepParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#input_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_main(DataStepParser.Input_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(DataStepParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#put_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_stmt(DataStepParser.Put_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#input_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_specification(DataStepParser.Input_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#put_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_specification(DataStepParser.Put_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#pointer_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_control(DataStepParser.Pointer_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#informat_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformat_list(DataStepParser.Informat_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#input_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable_format(DataStepParser.Input_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#input_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable(DataStepParser.Input_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#put_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable_format(DataStepParser.Put_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#put_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable(DataStepParser.Put_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#column_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_point_control(DataStepParser.Column_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#line_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_point_control(DataStepParser.Line_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#format_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_modifier(DataStepParser.Format_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#column_specifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_specifications(DataStepParser.Column_specificationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(DataStepParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#sas_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSas_stmt_list(DataStepParser.Sas_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(DataStepParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#if_then_else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_then_else_stmt(DataStepParser.If_then_else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(DataStepParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#abort_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_main(DataStepParser.Abort_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#abort_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_stmt(DataStepParser.Abort_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec(DataStepParser.File_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#proc_stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_stmt_block(DataStepParser.Proc_stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#proc_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_stmt(DataStepParser.Proc_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#proc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_name(DataStepParser.Proc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#array_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_main(DataStepParser.Array_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#array_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_stmt(DataStepParser.Array_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#array_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_name(DataStepParser.Array_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#array_subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_subscript(DataStepParser.Array_subscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#array_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elements(DataStepParser.Array_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#initial_value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_value_list(DataStepParser.Initial_value_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#initial_value_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_value_list_item(DataStepParser.Initial_value_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#initial_value_list_bk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_value_list_bk(DataStepParser.Initial_value_list_bkContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#constant_iter_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_iter_value(DataStepParser.Constant_iter_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#constant_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_value(DataStepParser.Constant_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#by_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_main(DataStepParser.By_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#by_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy_stmt(DataStepParser.By_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#call_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_main(DataStepParser.Call_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(DataStepParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#datalines_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatalines_main(DataStepParser.Datalines_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#datalines_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatalines_stmt(DataStepParser.Datalines_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#datalines4_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatalines4_stmt(DataStepParser.Datalines4_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#drop_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_main(DataStepParser.Drop_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(DataStepParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#infile_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfile_main(DataStepParser.Infile_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#infile_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfile_stmt(DataStepParser.Infile_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#file_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_specification(DataStepParser.File_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#device_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevice_type(DataStepParser.Device_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#infile_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfile_options(DataStepParser.Infile_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#means_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeans_main(DataStepParser.Means_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#means_proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeans_proc(DataStepParser.Means_procContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#run_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun_main(DataStepParser.Run_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#run_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRun_stmt(DataStepParser.Run_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#doLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoLoop(DataStepParser.DoLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#loopVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopVariable(DataStepParser.LoopVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#startValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartValue(DataStepParser.StartValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#endValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndValue(DataStepParser.EndValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#incrementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementValue(DataStepParser.IncrementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#putStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutStatement(DataStepParser.PutStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DataStepParser#outputExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputExpression(DataStepParser.OutputExpressionContext ctx);
}
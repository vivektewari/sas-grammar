// Generated from /home/pooja/PycharmProjects/sas-grammar/Loop.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LoopParser}.
 */
public interface LoopListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LoopParser#doLoop}.
	 * @param ctx the parse tree
	 */
	void enterDoLoop(LoopParser.DoLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#doLoop}.
	 * @param ctx the parse tree
	 */
	void exitDoLoop(LoopParser.DoLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#loopVariable}.
	 * @param ctx the parse tree
	 */
	void enterLoopVariable(LoopParser.LoopVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#loopVariable}.
	 * @param ctx the parse tree
	 */
	void exitLoopVariable(LoopParser.LoopVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#startValue}.
	 * @param ctx the parse tree
	 */
	void enterStartValue(LoopParser.StartValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#startValue}.
	 * @param ctx the parse tree
	 */
	void exitStartValue(LoopParser.StartValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#endValue}.
	 * @param ctx the parse tree
	 */
	void enterEndValue(LoopParser.EndValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#endValue}.
	 * @param ctx the parse tree
	 */
	void exitEndValue(LoopParser.EndValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#incrementValue}.
	 * @param ctx the parse tree
	 */
	void enterIncrementValue(LoopParser.IncrementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#incrementValue}.
	 * @param ctx the parse tree
	 */
	void exitIncrementValue(LoopParser.IncrementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LoopParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LoopParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void enterPutStatement(LoopParser.PutStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#putStatement}.
	 * @param ctx the parse tree
	 */
	void exitPutStatement(LoopParser.PutStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#outputExpression}.
	 * @param ctx the parse tree
	 */
	void enterOutputExpression(LoopParser.OutputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#outputExpression}.
	 * @param ctx the parse tree
	 */
	void exitOutputExpression(LoopParser.OutputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(LoopParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(LoopParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(LoopParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(LoopParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(LoopParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(LoopParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(LoopParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(LoopParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(LoopParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(LoopParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LoopParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LoopParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LoopParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LoopParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(LoopParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(LoopParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LoopParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LoopParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(LoopParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(LoopParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void enterOf_var_list(LoopParser.Of_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#of_var_list}.
	 * @param ctx the parse tree
	 */
	void exitOf_var_list(LoopParser.Of_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers_list(LoopParser.Identifiers_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#identifiers_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers_list(LoopParser.Identifiers_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void enterIn_var_list(LoopParser.In_var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#in_var_list}.
	 * @param ctx the parse tree
	 */
	void exitIn_var_list(LoopParser.In_var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void enterColonInts(LoopParser.ColonIntsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#colonInts}.
	 * @param ctx the parse tree
	 */
	void exitColonInts(LoopParser.ColonIntsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(LoopParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(LoopParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#input_main}.
	 * @param ctx the parse tree
	 */
	void enterInput_main(LoopParser.Input_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#input_main}.
	 * @param ctx the parse tree
	 */
	void exitInput_main(LoopParser.Input_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInput_stmt(LoopParser.Input_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#input_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInput_stmt(LoopParser.Input_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPut_stmt(LoopParser.Put_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#put_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPut_stmt(LoopParser.Put_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void enterInput_specification(LoopParser.Input_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#input_specification}.
	 * @param ctx the parse tree
	 */
	void exitInput_specification(LoopParser.Input_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void enterPut_specification(LoopParser.Put_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#put_specification}.
	 * @param ctx the parse tree
	 */
	void exitPut_specification(LoopParser.Put_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void enterPointer_control(LoopParser.Pointer_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#pointer_control}.
	 * @param ctx the parse tree
	 */
	void exitPointer_control(LoopParser.Pointer_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void enterInformat_list(LoopParser.Informat_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#informat_list}.
	 * @param ctx the parse tree
	 */
	void exitInformat_list(LoopParser.Informat_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable_format(LoopParser.Input_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#input_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable_format(LoopParser.Input_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void enterInput_variable(LoopParser.Input_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#input_variable}.
	 * @param ctx the parse tree
	 */
	void exitInput_variable(LoopParser.Input_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable_format(LoopParser.Put_variable_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#put_variable_format}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable_format(LoopParser.Put_variable_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void enterPut_variable(LoopParser.Put_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#put_variable}.
	 * @param ctx the parse tree
	 */
	void exitPut_variable(LoopParser.Put_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void enterColumn_point_control(LoopParser.Column_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#column_point_control}.
	 * @param ctx the parse tree
	 */
	void exitColumn_point_control(LoopParser.Column_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void enterLine_point_control(LoopParser.Line_point_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#line_point_control}.
	 * @param ctx the parse tree
	 */
	void exitLine_point_control(LoopParser.Line_point_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void enterFormat_modifier(LoopParser.Format_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#format_modifier}.
	 * @param ctx the parse tree
	 */
	void exitFormat_modifier(LoopParser.Format_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LoopParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void enterColumn_specifications(LoopParser.Column_specificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LoopParser#column_specifications}.
	 * @param ctx the parse tree
	 */
	void exitColumn_specifications(LoopParser.Column_specificationsContext ctx);
}
// Generated from /home/pooja/PycharmProjects/sas-grammar/Loop.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LoopParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LoopVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LoopParser#doLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoLoop(LoopParser.DoLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#loopVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopVariable(LoopParser.LoopVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#startValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartValue(LoopParser.StartValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#endValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndValue(LoopParser.EndValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#incrementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementValue(LoopParser.IncrementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LoopParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#putStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutStatement(LoopParser.PutStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#outputExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputExpression(LoopParser.OutputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(LoopParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(LoopParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(LoopParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(LoopParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(LoopParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LoopParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LoopParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LoopParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LoopParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(LoopParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#of_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOf_var_list(LoopParser.Of_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#identifiers_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifiers_list(LoopParser.Identifiers_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#in_var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_var_list(LoopParser.In_var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#colonInts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonInts(LoopParser.ColonIntsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(LoopParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#input_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_main(LoopParser.Input_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#input_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_stmt(LoopParser.Input_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#put_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_stmt(LoopParser.Put_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#input_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_specification(LoopParser.Input_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#put_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_specification(LoopParser.Put_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#pointer_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_control(LoopParser.Pointer_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#informat_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInformat_list(LoopParser.Informat_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#input_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable_format(LoopParser.Input_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#input_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_variable(LoopParser.Input_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#put_variable_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable_format(LoopParser.Put_variable_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#put_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut_variable(LoopParser.Put_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#column_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_point_control(LoopParser.Column_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#line_point_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine_point_control(LoopParser.Line_point_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#format_modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_modifier(LoopParser.Format_modifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LoopParser#column_specifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_specifications(LoopParser.Column_specificationsContext ctx);
}
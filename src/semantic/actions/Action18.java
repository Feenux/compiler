package semantic.actions;

import gals.SemanticError;
import gals.Token;
import semantic.Context;
import semantic.MsilCommand;
import semantic.VarType;

public class Action18 implements SemanticActionHandler{

	@Override
	public int id() {
		return 18;
	}

	@Override
	public void handle(Token token, Context context) throws SemanticError {
		VarType t1 = context.getTypeQueue().poll();
		VarType t2 = context.getTypeQueue().poll();
		
		if(t1 != VarType.LOGICAL || t2 != VarType.LOGICAL) {
			throw new SemanticError("Erro 18");
		}
		
		context.getTypeQueue().add(VarType.LOGICAL);
		context.getCode().add(MsilCommand.OR);
	}

}

package net.shu_cream.eclipse.font;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;


public class ResetHandler extends AbstractHandler {

	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		FontPlugin.getDefault().reset();
		return null;
	}

}

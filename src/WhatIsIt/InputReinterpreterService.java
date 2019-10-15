package WhatIsIt;

import java.util.ArrayList;
import java.util.List;

public class InputReinterpreterService {
	
	protected String input;
	
	public InputReinterpreterService(String input) {
		this.input = input;
	}
	
	public String execute() {
		
		InitialBaseDataImportService service = new InitialBaseDataImportService();
		service.importBaseData();
		
		List<String> creation = new ArrayList<String>();
		for (char ch: this.input.toCharArray()) {
			String element = service.getExpressionByChar(ch);
			element = element.substring(0, 1).toUpperCase() + element.substring(1);
			
			creation.add(element);
		}
		
		return String.join(" ", creation);
	}
}

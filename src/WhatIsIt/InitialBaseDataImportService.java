package WhatIsIt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class InitialBaseDataImportService extends WhatIsIt {

	protected List<String> allLines;

	public void importBaseData() {

		try {
			File file = new File("src/dat/wordlist.what");

			BufferedReader br = new BufferedReader(new FileReader(file));

			this.allLines = new ArrayList<String>();
			String st;
			while ((st = br.readLine()) != null) {

				this.allLines.add(st);
			}

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}

	public String getExpressionByChar(char letter) {

		List<String> sorted = new ArrayList<String>();
		this.allLines.forEach(item -> {

			if (item.charAt(0) == letter && item.length() > 5) {
				sorted.add(item);
			}
		});

		int index = (int) (Math.random() * sorted.size() + 1);
		
		return sorted.get(index);
	}
}

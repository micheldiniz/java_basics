package com.stock.project.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.stock.project.fileprocessors.StockFileData;
import com.stock.project.fileprocessors.StockFileReader;

public class StockFileApplication {

	public static void main(String args[]) throws IOException {
		StockFileReader fr = new StockFileReader("resources/table.csv");

		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
		StockFileData fileData = new StockFileData();
		fileData.addData(dataResult);
		fileData.printData();
		System.out.println(dataResult.size());
	}

	/**
	 * Complete the method body so that it returns the given structure needed to
	 * populate the data field in the StockFileData class.
	 * 
	 * @param headers
	 * @param lines
	 * @return List
	 */
	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines) {
		List<HashMap<String, Double>> dataResult = new ArrayList<>();
		
		lines.forEach(l -> {
			
			HashMap<String, Double> stock = new HashMap<String, Double>();
			
			String[] array = l.split(",");
			
			for (int i = 0; i < array.length; i++) {
				stock.put(headers.get(i), Double.valueOf(array[i]));
			}
			dataResult.add(stock);
		});

		return dataResult;
	}

}

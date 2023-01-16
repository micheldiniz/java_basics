package com.stock.analysis.client;

import java.io.IOException;

import com.stock.analysis.aggregators.AggregatorProcessor;
import com.stock.analysis.aggregators.MaxAggregator;
import com.stock.analysis.aggregators.MeanAggregator;
import com.stock.analysis.aggregators.MinAggregator;


public class AggregatorApp {

	public static void main(String[] args) throws IOException {
	
		MaxAggregator maxAgg = new MaxAggregator();
		AggregatorProcessor<MaxAggregator> maxAggsProcessor = new AggregatorProcessor<MaxAggregator>(maxAgg, "resources/table.csv");
		double maxValue = maxAggsProcessor.runAggregator(1);
		System.out.println(maxValue);

		MinAggregator minAgg = new MinAggregator();
		AggregatorProcessor<MinAggregator> minAggsProcessor = new AggregatorProcessor<MinAggregator>(minAgg, "resources/table.csv");
		double minValue = minAggsProcessor.runAggregator(1);
		System.out.println(minValue);
		
		MeanAggregator meanAgg = new MeanAggregator();
		AggregatorProcessor<MeanAggregator> meanAggsProcessor = new AggregatorProcessor<MeanAggregator>(meanAgg, "resources/table.csv");
		double meanValue = meanAggsProcessor.runAggregator(1);
		System.out.println(meanValue );
	}

}

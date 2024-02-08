package aggregators;

import fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.List;

public class AggregatorProcessor<G extends Aggregator> {
    G agg;
    String path;

    public AggregatorProcessor(G given_agg, String path) {
        this.agg = given_agg;
        this.path = path;
    }

    public double runAggregator(int column) throws IOException {
        StockFileReader reader = new StockFileReader(this.path);
        List<String> lines = reader.readFileData();
        column--;

        for (String line : lines) {
            String[] row = line.split(",");
            double number = Double.parseDouble(row[column]);
            agg.add(number);
        }

        return agg.calculate();
    }
}

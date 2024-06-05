package dip1.model.util;

import dip1.model.ReportItem;

import java.util.List;

public class ConsoleReporter implements Reportable {
    @Override
    public void output(List<ReportItem> items) {
        System.err.println("Output to printer");
        for (ReportItem item : items) {
            System.err.format("console %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}

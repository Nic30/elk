package org.eclipse.elk.cli;

import org.eclipse.elk.alg.layered.LayeredLayoutProvider;
import org.eclipse.elk.core.util.BasicProgressMonitor;
import org.eclipse.elk.graph.ElkNode;
import org.eclipse.elk.graph.json.ElkGraphJson;

public class ElkLayeredCli {

    public static void main(String[] args) {
        String json_in = "{" + "\"id\": \"root\"," + "\"children\": [{\"id\": \"n1\"}, {\"id\": 3}],"
                + "\"edges\": [{\"id\": \"e1\"," + "  \"sources\": [ \"n1\" ]," + "  \"targets\": [ 3 ]" + "}]" + "}";

        ElkNode root = ElkGraphJson.forGraph(json_in).toElk();
        LayeredLayoutProvider la = new LayeredLayoutProvider();
        
        la.initialize("");

        BasicProgressMonitor progressMonitor = new BasicProgressMonitor();
        la.layout(root, progressMonitor);
        
        String json_out = ElkGraphJson.forGraph(root)
                .omitLayout(true)
                .omitZeroDimension(true)
                .omitZeroPositions(true)
                .shortLayoutOptionKeys(false)
                .prettyPrint(true)
                .toJson();
        System.out.print(json_out);
    }
}

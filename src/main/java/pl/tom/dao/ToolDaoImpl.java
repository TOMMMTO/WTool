package pl.tom.dao;

import pl.tom.model.Tool;
import pl.tom.model.ToolType;

import java.util.Arrays;
import java.util.List;

public class ToolDaoImpl implements ToolDao {
    @Override
    public List<Tool> getAll() {
        Tool tool1 = new Tool(1111, "Gregor", ToolType.HAMMER, true);
        Tool tool2 = new Tool(2222,"AS",ToolType.OTHER,false);
        Tool tool3 = new Tool(3333, "JS", ToolType.SAW, true);
        Tool tool4 = new Tool(4444, "NEW", ToolType.SCREWDRIVER, false);

        return Arrays.asList(tool1, tool2, tool3, tool4);
    }
}

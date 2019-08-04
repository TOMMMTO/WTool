package pl.tom.service;

import pl.tom.dao.ToolDao;
import pl.tom.dao.ToolDaoImpl;

public class ToolServiceImpl implements ToolService {

    private final ToolDao toolDao = new ToolDaoImpl();

    @Override
    public ToolDao getAllTools() {
        return toolDao;
    }
}

package pl.tom.dao;

import pl.tom.model.Tool;

import java.util.List;

public interface ToolDao {
    List<Tool> getAll();
    void setAvailability(boolean isAvailable, long id);

}

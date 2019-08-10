package pl.tom.service;

import pl.tom.dao.ToolDao;
import pl.tom.model.Tool;

import java.util.List;

public interface ToolService {
   List<Tool> getAllTools();
}

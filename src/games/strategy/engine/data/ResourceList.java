package games.strategy.engine.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceList extends GameDataComponent {
  private static final long serialVersionUID = -8812702449627698253L;
  private final Map<String, Resource> m_resourceList = new HashMap<String, Resource>();

  public ResourceList(final GameData data) {
    super(data);
  }

  protected void addResource(final Resource resource) {
    m_resourceList.put(resource.getName(), resource);
  }

  public int size() {
    return m_resourceList.size();
  }

  public Resource getResource(final String name) {
    return m_resourceList.get(name);
  }

  public List<Resource> getResources() {
    return new ArrayList<Resource>(m_resourceList.values());
  }
}

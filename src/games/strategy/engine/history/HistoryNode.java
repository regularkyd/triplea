package games.strategy.engine.history;

import java.io.Serializable;

import javax.swing.tree.DefaultMutableTreeNode;

public abstract class HistoryNode extends DefaultMutableTreeNode implements Serializable {
  private static final long serialVersionUID = 628623470654123887L;

  private static final boolean allowschildren = true;

  public HistoryNode(final String title) {
    super(title, allowschildren);
  }

  public String getTitle() {
    return (String) super.getUserObject();
  }

  public abstract SerializationWriter getWriter();
}

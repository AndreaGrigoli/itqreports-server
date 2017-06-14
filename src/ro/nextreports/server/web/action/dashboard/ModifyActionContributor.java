package ro.nextreports.server.web.action.dashboard;

import java.util.List;

import org.apache.wicket.markup.html.link.AbstractLink;
import org.apache.wicket.model.StringResourceModel;

import ro.nextreports.server.domain.Entity;
import ro.nextreports.server.web.core.action.AbstractActionContributor;
import ro.nextreports.server.web.core.action.ActionContext;

public class ModifyActionContributor extends AbstractActionContributor {

	public static final String ID = ModifyActionContributor.class.getName();

	// does not matter for dashboards
	// Dashboards panel contains Dashboard and Link elements (which are not entities)
	public boolean support(List<Entity> entities) {
		return true;
	}

	public String getActionImage() {
		return "images/edit.png";
	}

	public String getActionName() {
		return new StringResourceModel("DashboardPopupMenuModel.modify", null).getString();
	}

	public String getId() {
		return ID;
	}

	public AbstractLink getLink(final ActionContext actionContext) {
		return new ModifyActionLink((DashboardActionContext)actionContext);
	}

}

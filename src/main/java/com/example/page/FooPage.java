package com.example.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.wicketstuff.annotation.mount.MountPath;

import com.example.service.IBarService;

@MountPath("FooPage")
public class FooPage extends WebPage {
  private static final long serialVersionUID = 1765245004153443150L;

  @SpringBean
  private IBarService barService;

  public FooPage() {
    this.add(new Label("label", Model.of(barService.fetchMessage())));
  }

}

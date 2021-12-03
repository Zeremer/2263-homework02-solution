package edu.isu.cs.cs2263.hw02.views;

import edu.isu.cs.cs2263.hw02.App;
import javafx.scene.Node;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.flogger.Flogger;
import lombok.extern.log4j.Log4j2;

@RequiredArgsConstructor @Flogger
public abstract class AppView implements IAppView {

    @Getter @Setter protected Node view;
    @Getter @Setter protected App parent;

    public AppView(App parent) {
        this.parent = parent;
        log.atInfo().log("Initializing view");
        initView();
    }
}

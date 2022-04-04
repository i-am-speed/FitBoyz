package FitBoyz.view;

import FitBoyz.model.FitBoyz;

public class FitBoyzPresenter {
    private FitBoyz model;
    private FitBoyzView view;

    public FitBoyzPresenter(FitBoyz model, FitBoyzView view) {
        this.model = model;
        this.view = view;
       // updateView(); // --> Er is nog niets om te laten zien!
        addEventHandlers();
    }

    private void updateView() {
       // TODO
    }

    private void addEventHandlers() {
        // TODO

    }

    public FitBoyzView getView() {
        return view;
    }
}

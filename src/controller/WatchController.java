package controller;

import model.Watch;
import java.util.ArrayList;
import java.util.List;

public class WatchController {
    private List<Watch> watchList = new ArrayList<>();

    public boolean addWatch(Watch watch) {
        return watchList.add(watch);
    }

    public List<Watch> getAllWatches() {
        return watchList;
    }

    public boolean updateWatch(Watch watch) {
        for (int i = 0; i < watchList.size(); i++) {
            if (watchList.get(i).getId() == watch.getId()) {
                watchList.set(i, watch);
                return true;
            }
        }
        return false;
    }

    public boolean deleteWatch(int id) {
        for (int i = 0; i < watchList.size(); i++) {
            if (watchList.get(i).getId() == id) {
                watchList.remove(i);
                return true;
            }
        }
        return false;
    }
}
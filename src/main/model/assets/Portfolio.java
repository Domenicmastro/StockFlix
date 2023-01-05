package main.model.assets;

import java.util.Iterator;

public class Portfolio extends ListOfAsset {

    // bidirectional with user?

    @Override
    public Iterator<Asset> iterator() {
        return null;
    }
    //should really be list of PURCHASED asset
}

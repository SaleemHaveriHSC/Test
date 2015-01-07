package com.tesco.priceintegrity.common.episyslocator;

import com.tesco.priceintegrity.episysapi.EpisysWSLocator;
import com.tesco.priceintegrity.episysapi.EpisysWSPortType;

/**
 * Created by hb41 on 05/12/2014.
 */

public class EpisysPortHandle {

    private static EpisysWSPortType episysService;

    public static EpisysWSPortType getEpisysService() {
        return episysService;
    }

    public static void setEpisysService(EpisysWSPortType episysService) {
        EpisysPortHandle.episysService = episysService;
    }

    public static void getEpisysPort() {
        try {

            //EpisysWSLocator episysLocator = new EpisysWSLocator();
            setEpisysService( new EpisysWSLocator().getEpisysWSHttpSoap12Endpoint());

        }catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        }
    }

}

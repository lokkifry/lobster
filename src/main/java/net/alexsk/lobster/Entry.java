package net.alexsk.lobster;

import org.slf4j.ext.XLogger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by alexsk on 11.10.18.
 */
@Path("/api")
public class Entry {

    @Inject
    Logger logger;

    @GET
    @Produces("test/xml")
    public String processingGet () {
        logger.log(Level.INFO, "start get request");
        return "test";
    }

}

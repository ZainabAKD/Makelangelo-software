module com.marginallyclever.makelangelo {
    requires com.marginallyclever.nodegraphcore;
    requires org.slf4j;
    requires jssc;
    requires java.desktop;
    requires jogl.all;
    requires logback.core;
    requires org.json;
    requires org.apache.commons.io;
    requires org.apache.commons.compress;
    requires java.prefs;
    requires kabeja;
    requires batik.all;
    requires xml.apis.ext;
    requires vecmath;
    requires jrpicam;
    requires org.jetbrains.annotations;
    requires com.formdev.flatlaf;
    requires org.reflections;

    requires org.locationtech.jts;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;

    opens com.marginallyclever.convenience;
    opens com.marginallyclever.convenience.voronoi;
    opens com.marginallyclever.makelangelo.makeart.io;
    opens com.marginallyclever.makelangelo.plotter.plottercontrols;
    opens com.marginallyclever.makelangelo.turtle;

    exports com.marginallyclever.convenience.log to logback.core;

    exports com.marginallyclever.makelangelo.donatelloimpl to com.marginallyclever.nodegraphcore;
    exports com.marginallyclever.makelangelo.donatelloimpl.nodes to com.marginallyclever.nodegraphcore;
    exports com.marginallyclever.makelangelo.donatelloimpl.nodes.shapes to com.marginallyclever.nodegraphcore;
    opens com.marginallyclever.convenience.noise;
    opens com.marginallyclever.convenience.helpers;

    provides com.marginallyclever.nodegraphcore.NodeRegistry with
            com.marginallyclever.makelangelo.donatelloimpl.DonatelloRegistry;

    provides com.marginallyclever.nodegraphcore.DAORegistry with
            com.marginallyclever.makelangelo.donatelloimpl.DonatelloRegistry;
}
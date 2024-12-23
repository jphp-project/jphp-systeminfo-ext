package org.develnext.jphp.ext.systeminfo;

import org.develnext.jphp.ext.systeminfo.classes.DeviceAPI;
import org.develnext.jphp.ext.systeminfo.classes.SystemAPI;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class SystemAPIExtension extends Extension {
    public static final String NS = "systeminfo";

    public SystemAPIExtension() {}

    public Extension.Status getStatus() {
        return Extension.Status.STABLE;
    }

    public String[] getPackageNames() {
        return new String[] { "systeminfo" };
    }

    public void onRegister(CompileScope scope) {
        registerClass(scope, DeviceAPI.class);
        registerClass(scope, SystemAPI.class);
    }
}

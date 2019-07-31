package build.java.service;

import build.java.BuildJava;
import build.java.BuildJavaAbstract;
import common.Util;

public class GeneratorService extends BuildJavaAbstract implements BuildJava {

    public GeneratorService() {
        templateName = "service.ftl";
    }

    @Override
    public void generateDataList() {
        dataMap.put("package", propMap.get("package_service"));
        dataMap.put("entityClass", propMap.get("package_entity") + "." + Util.DBNameToJavaName(propMap.get("tableName")));
        dataMap.put("entityName", Util.DBNameToJavaName(propMap.get("tableName")));
        dataMap.put("serviceName", Util.DBNameToJavaName(propMap.get("tableName"))+"Service");

        // 生成目录
        folder = Util.packToFolder(propMap.get("package_service"));
        // 生成文件
        generateFileName = Util.DBNameToJavaName(propMap.get("tableName")) + "Service.java";
    }
}

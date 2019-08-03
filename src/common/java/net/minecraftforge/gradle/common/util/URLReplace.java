/*
 * Created on 2019/8/3
 * Author: MaHua_A
 * Copyright 2019 by OreCraft Studio
 * DO NOT MODIFY THESE WORDS
 */


package net.minecraftforge.gradle.common.util;

public final class URLReplace {
    public static String replaceMojang2BMCL(String url){
        return url
                .replace("https://libraries.minecraft.net/","https://bmclapi2.bangbang93.com/libraries/")
                .replace("https://launchermeta.mojang.com","https://bmclapi2.bangbang93.com")
                .replace("https://launcher.mojang.com","https://bmclapi2.bangbang93.com");
    }
}

plugins {
    java
}

group = "xyz.acrylicstyle"
version = "1.0.0"

repositories {
    mavenCentral()
    maven { url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/") }
}

dependencies {
    compileOnly("org.bukkit:bukkit:1.11-R0.1-SNAPSHOT")
}

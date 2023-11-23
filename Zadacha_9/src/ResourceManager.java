import java.util.HashMap;
import java.util.Map;

class ResourceManager {
    private static ResourceManager instance;
    private Map<String, Resource> resourceCache;

    private ResourceManager() {
        resourceCache = new HashMap<String, Resource>();
    }

    public static synchronized ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public Resource getResource(String key) {
        Resource resource = resourceCache.get(key);

        if (resource == null) {
            if (key.endsWith(".png")) {
                resource = new ImageResource(key);
            } else if (key.endsWith(".ttf")) {
                resource = new FontResource(key);
            } else if (key.endsWith(".mp3")) {
                resource = new SoundsResource(key);
            }
            resourceCache.put(key, resource);
        }

        return resource;
    }
}


import java.util.Collection;

public interface DatabaseAccess {

    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();
    // Добавляем в интерфейс метод по добавлению в базу данных новой 3D модели
    void newModel3D();
}

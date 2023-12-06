import java.util.ArrayList;
import java.util.Collection;

public class EditorDatabaseAccess implements DatabaseAccess {

    private final Database editorDatabase;

    public EditorDatabaseAccess(Database editorDatabase){
        this.editorDatabase = editorDatabase;

    }

    @Override
    public void addEntity(Entity entity) {
        editorDatabase.getAll().add(entity);
    }

    @Override
    public void removeEntity(Entity entity) {
        editorDatabase.getAll().remove(entity);
    }

    @Override
    public Collection<Texture> getAllTextures() {
        Collection<Texture> models = new ArrayList<>();
        for (Entity entity: editorDatabase.getAll()) {
            if (entity instanceof Texture)
            {
                models.add((Texture)entity);
            }
        }
        return models;
    }

    @Override
    public Collection<Model3D> getAllModels() {
        Collection<Model3D> models = new ArrayList<>();
        for (Entity entity: editorDatabase.getAll()) {
            if (entity instanceof Model3D)
            {
                models.add((Model3D)entity);
            }
        }
        return models;
    }

    // реализация из интерфейса метода по добавлению в базу данных новой 3d модели
    @Override
    public void newModel3D() {
        Model3D model3d = new Model3D();
        editorDatabase.getAll2().add(model3d);
    }
}

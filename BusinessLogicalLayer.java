import java.util.Collection;

public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();
    void renderModel(Model3D model);
    void renderAllModels();
    // добавляем новый метод по созданию новой 3D модели
    void createModel3D();

}

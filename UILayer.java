public interface UILayer {

    void openProject(String fileName);
    void showProjectSettings();

    void saveProject();

    void printAllModels();

    void printAllTextures();

    void renderAll();
    void renderModel(int i);

    // new method for creating new 3D model
    void createNewModel3D();

}

/*package lesson19;

public class Controller {

    public static File put(Storage storage, File file) throws Exception {
        if (file != null) {
            if (!Validate.validate(storage,file))
                return null;
            for (int i = 0; i <= storage.getFiles().length; i++) {
                if (storage.getFiles()[i] == null) {
                    storage.getFiles()[i] = file;
                    return file;
                }
            }
        }
        throw new Exception("cannot add file" + file.getId() + "to storage" + storage.getId());
    }


    public static File delete(Storage storage, File file)throws Exception {
        if (file != null) {
            if (!Validate.validate(storage,file))
                return null;
            for (int i = 0; i <= storage.getFiles().length; i++) {
                if (storage.getFiles()[i] == file) {
                    storage.getFiles();
                    return file;
                }
            }
        }
        throw new Exception("cannot remove file" + file.getId() + "from storage" + storage.getId());

    }

    public static void trasferAll(Storage storageFrom, Storage storageTo){
        if(Validate.checkTransfer(storageFrom, storageTo, storageTo.getFiles())){
            //тут трансфер
        }
    }

    public static void transferFile(Storage storagefrom, Storage storageTo, long id) {

    }
}*/


package lesson19;

public class Validate {
    public static boolean validate(Storage storage, File file)throws Exception{
        findById(storage, file.getId());
        checkFormat(storage, file.getFormat());
        checkForFreePlace(storage);
        checkForSize(storage, file.getSize());
        return true;


    }
    public static void checkForSize(Storage storage, long fileSize) throws Exception{
        long usedSize = 0;
        for(File file: storage.getFiles()){
            if(file != null)
                usedSize+= file.getSize();
        }
        if(usedSize + fileSize > storage.getStorageSize())
            throw new Exception("No free space in storage" + storage.getId());
    }

    public static void checkForFreePlace(Storage storage)throws Exception{
        for(File file: storage.getFiles()){
            if(file == null)
                return;
        }
        throw new Exception("No free space in storage" + storage.getId());
    }
    public static void checkForFreePlace(Storage storage, long placesNeeded)throws Exception{
        int count = 0;
        for(File file: storage.getFiles()){
            if(file == null)
                count++;
        }
        if(count < placesNeeded)
            throw new Exception("No free space in storage" + storage.getId());
    }

    public static void checkFormat(Storage storage, String fileFormat)throws Exception{
        for(String format : storage.getFormatsSupported()){
            if (format.equals(fileFormat))
                return;
        }
        throw new Exception(fileFormat + "is not supported in storage"+ storage.getId());
    }
    public static File findById(Storage storage, long id)throws Exception{
        for(File file: storage.getFiles()){
            if (file != null && file.getId() == id)
                throw new Exception("File" + id + "already exist in storage" + storage.getId());
        }
        return null;
    }
    public static void checkTransfer(Storage storageFrom, Storage storageTo, File file) throws Exception {
        findById(storageTo, storageFrom.getId());
        checkFormat(storageTo, file.getFormat());
        checkForFreePlace(storageTo);
        checkForSize(storageTo, storageTo.getStorageSize());
        throw new Exception(" Error");

    }
}

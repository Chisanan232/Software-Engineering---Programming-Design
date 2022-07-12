import { FileFormat } from "./builder"


interface IBaseFileSaver {
    /**
     * The interface defines which attribute and behavior a file saver it should has.
     * You could see that it rules that it should have attribute *file_format*. However, 
     * be more specifically, what's the attribute *file_format*?
     */

    file_format: FileFormat;

    /**
     * Save data.
     * @param data : In generally, this value should be iterable.
     */
    save_data(data: any[]): void;
}


export abstract class BaseFileSaver implements IBaseFileSaver {
    /**
     * This is an abstracted class and it implements interface *IBaseFileSaver*. Please 
     * take a look at attribute *file_format*, constructor *constructor* and method *save_data*. 
     * The attribute be defined as a public attribute because it cannot be an attribute with less priority.
     * The constructor tells every client site code that you should give me an option which is an instance of sub-class of *FileFormat* 
     * and I would initial it to save at attribute *file_format* to let every sub-classes to use it in implementation.
     * For the last part, abstract method *save_data*, it just be more clear from above 2 ones so that developer know they could implement
     * this feature by attribute *file_format*.
     */

    public file_format: FileFormat;

    /**
     * It rules that every sub-classes of *BaseFileSaver* must to pass a parameter which is an instance which is *FileFormat* type to instantiate.
     * @param file_format : An instance of one sub-class of *FileFormat*.
     */
    constructor(file_format: FileFormat) {
        this.file_format = file_format;
    }

    /**
     * Save data as a specific file format.
     * @param data : In generally, this value should be iterable.
     */
    public abstract save_data(data: any[]): void;
}


export class FileSaver extends BaseFileSaver {
    /**
     * The implmenetation of abstract class *BaseFileSaver*.
     */

    save_data(data: any[]): void {
        this.file_format.open();
        this.file_format.write(data);
        this.file_format.close();
    }
}



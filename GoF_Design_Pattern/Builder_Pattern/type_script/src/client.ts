import { CSVFormat, JSONFormat } from "./builder"
import { BaseFileSaver, FileSaver } from "./director"


function main(saving_type: string) {
    var saver: BaseFileSaver;

    switch (saving_type) {
        case "CSV":
            saver = new FileSaver(new CSVFormat());
            saver.save_data([]);
            break;
        case "JSON":
            saver = new FileSaver(new JSONFormat());
            saver.save_data([]);
            break;
    }
}


main("CSV");
main("JSON");

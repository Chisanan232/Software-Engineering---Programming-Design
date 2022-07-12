"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const builder_1 = require("./builder");
const director_1 = require("./director");
function main(saving_type) {
    var saver;
    switch (saving_type) {
        case "CSV":
            saver = new director_1.FileSaver(new builder_1.CSVFormat());
            saver.save_data([]);
            break;
        case "JSON":
            saver = new director_1.FileSaver(new builder_1.JSONFormat());
            saver.save_data([]);
            break;
    }
}
main("CSV");
main("JSON");

"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.FileSaver = exports.BaseFileSaver = void 0;
class BaseFileSaver {
    constructor(file_format) {
        this.file_format = file_format;
    }
}
exports.BaseFileSaver = BaseFileSaver;
class FileSaver extends BaseFileSaver {
    save_data(data) {
        this.file_format.open();
        this.file_format.write(data);
        this.file_format.close();
    }
}
exports.FileSaver = FileSaver;

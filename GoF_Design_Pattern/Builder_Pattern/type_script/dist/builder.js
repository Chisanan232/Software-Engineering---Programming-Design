"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.JSONFormat = exports.CSVFormat = void 0;
class CSVFormat {
    open() {
        console.log("Open the CSV format file streaming.");
    }
    write(data) {
        console.log("Get data: " + data + " and write it to CSV format file.");
    }
    close() {
        console.log("Close the CSV format file streaming.");
    }
}
exports.CSVFormat = CSVFormat;
class JSONFormat {
    open() {
        console.log("Open the JSON format file streaming.");
    }
    write(data) {
        console.log("Get data: " + data + " and write it to JSON format file.");
    }
    close() {
        console.log("Close the JSON format file streaming.");
    }
}
exports.JSONFormat = JSONFormat;

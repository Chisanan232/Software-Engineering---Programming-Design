export interface FileFormat {
    /**
     * The interface which defines which behaviors all sub-classes of this interface they should have.
     * Export this interface outside to let others could annotate variable data type as this.
     */

    // Initial the file IO streaming.
    open(): void;
    // Write the data into file IO streaming.
    write(data: any[]): void;
    // Safely close the file IO streaming.
    close(): void;
}


export class CSVFormat implements FileFormat {
    /**
     * Implement the behaviors how it works with 'CSV' type file format.
     */

    public open(): void {
        console.log("Open the CSV format file streaming.");
    }

    public write(data: any[]): void {
        console.log("Get data: " + data + " and write it to CSV format file.");
    }

    public close(): void {
        console.log("Close the CSV format file streaming.");
    }

}


export class JSONFormat implements FileFormat {
    /**
     * Implement the behaviors how it works with 'JSON' type file format.
     */

    public open(): void {
        console.log("Open the JSON format file streaming.");
    }

    public write(data: any[]): void {
        console.log("Get data: " + data + " and write it to JSON format file.");
    }

    public close(): void {
        console.log("Close the JSON format file streaming.");
    }

}

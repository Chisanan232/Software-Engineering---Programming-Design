FROM node:18.5.0

WORKDIR ./

COPY . . 

RUN \
    echo "npm version is: " && \
    npm --version && \
    # Install TypeScript by *npm*
    echo "Start to install typescript ... " && \
    npm install -g typescript && \
    # Compile TypeScript 
    echo "Start to compile typescript codes ... " && \
    tsc --build tsconfig.json

CMD ["node", "./dist/client.js"]

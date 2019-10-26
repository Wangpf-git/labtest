const path = require('path');

function resolve(dir) {
    return path.join(__dirname, dir)
}

module.exports = {
    css: {
        sourceMap: false
    },
    productionSourceMap: false,
    chainWebpack: (config) => {
        config.resolve.alias
            .set('@', resolve('src'))
            .set('@assets', resolve('src/assets'))
            .set('@components', resolve('src/components'))
            .set('@utils', resolve('src/layout'))
            .set('@views', resolve('src/base'))
    }
}
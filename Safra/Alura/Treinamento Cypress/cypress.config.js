const { defineConfig } = require("cypress");

module.exports = defineConfig({
  projectId: '81988g',
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
  },
});

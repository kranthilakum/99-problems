/**
 * Write a function that returns the last element of a list.
 */

function lastElement(elements) {
  if (elements === undefined) {
    return null;
  }
  if (Array.isArray(elements)) {
    return elements[elements.length - 1];
  }
}

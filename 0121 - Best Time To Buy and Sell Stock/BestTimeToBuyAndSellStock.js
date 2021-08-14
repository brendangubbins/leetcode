/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
  let min = Number.MAX_VALUE;
  let profit = 0;

  prices.forEach((price) => {
    min = Math.min(min, price);
    profit = Math.max(profit, price - min);
  });

  return profit;
};
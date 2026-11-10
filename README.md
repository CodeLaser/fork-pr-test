# fork-pr-test

A small Java project for rehearsing the dead-code review path: a fork in the
CodeLaser organization, review pull requests in the fork, and a final pull
request back to this repository.

Unused on purpose:

- `Cart.cheapest()` and the private `Cart.lowest(List)` it calls: package-local.
- `Coupon`: a class nobody uses.
- `Receipt.formatLegacy()`: public, unused here, but meant for applications
  outside this repository. A reviewer should mark it Alive.
- `com.example.shop.legacy`: seven classes that only call each other.

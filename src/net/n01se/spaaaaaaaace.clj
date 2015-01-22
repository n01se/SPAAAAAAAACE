(ns net.n01se.spaaaaaaaace)

(defrecord km [km])
(defrecord mi [mi])

(defn KM [km]
  (->km km))

(defn MI [mi]
  (->km (* 1.6 mi)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
